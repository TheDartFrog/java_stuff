import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class BracketChecker {

    public static void main(String[] args) {

        String fileName = "text.txt";
        String line;
        int lineNumber = 0;
        Stack<Node> stack = new Stack<>();

        try {

            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {

                lineNumber++;

                for(int i = 0; i < line.length(); i++) {

                    char currentChar = line.charAt(i);

                    if(currentChar == '(' || currentChar == '[' || currentChar == '{') {

                        stack.push(new Node(currentChar));

                    } else if(currentChar == ')' || currentChar == ']' || currentChar == '}') {

                        if(stack.isEmpty()) {

                            printError(line, lineNumber, i, currentChar, "No matching opening bracket found");
                            return;

                        }

                        Node lastOpenBracket = stack.pop();

                        if(!isMatchingBracket(lastOpenBracket.data, currentChar)) {

                            printError(line, lineNumber, i, currentChar, "Mismatched bracket");
                            return;

                        }
                    }
                }
            }

            if(!stack.isEmpty()) {

                String unclosedBrackets = "";

                while(!stack.isEmpty()) {

                    unclosedBrackets += stack.pop().data;

                }

                System.out.println("ERROR: Unclosed brackets: " + unclosedBrackets);
                return;
            }

            System.out.println("OK");
            bufferedReader.close();
        } catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
    }


    public static boolean isMatchingBracket(char openBracket, char closeBracket) {

        if (openBracket == '(' && closeBracket == ')') {

            return true;

        } else if (openBracket == '[' && closeBracket == ']') {

            return true;

        } else if (openBracket == '{' && closeBracket == '}') {

            return true;

        }
        return false;

    }

    public static void printError(String line, int lineNumber, int index, char incorrectChar, String errorMessage) {

        String lineWithPointer = line.substring(0, index) + "^" + line.substring(index + 1);

        System.out.println("ERROR in line " + lineNumber + ": '" + incorrectChar + "' " + errorMessage);

        System.out.println(lineWithPointer);
    }
}