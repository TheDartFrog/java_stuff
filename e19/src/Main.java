import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //////////////////////////////////////////////////////////
        String inputtedLine = null;
        Scanner epicScanning = new Scanner(System.in);

        String[] stringArray = {
                "2.5 9 5 - * 4 + 3.5 /",
                "2 7 5 + * 20 - 1 4 / /",
                "2 7 5 + * 20 - 1 4 / /",
                "2 7 5 + * 20 - 1 4 / /"
        };
        /////////////////////////////////////////////////////////


        System.out.println("Welcome! \n");

      /*  try
        {
            inputtedLine = epicScanning.next();

            epicScanning = new Scanner(System.in);
        }
        catch (InputMismatchException e)
        {
            System.out.println("\nUnexpected error occurred! Program will now exit, please restart to try again..");
            epicScanning = new Scanner(System.in);
            System.exit(0);
        }*/


//////////////////////////////
        int i = 0;
        while (i<stringArray.length) {
            inputtedLine = stringArray[i];
            System.out.println(inputtedLine);
            i++;
           // if (inputtedLine != null) {
                String[] lineParts = inputtedLine.split(" ");
                for (String string : lineParts) {
                    if (string.equals("+")) {
                        RPNStack.push(RPNStack.pop() + RPNStack.pop());
                    } else if (string.equals("-")) {
                        RPNStack.push(-RPNStack.pop() + RPNStack.pop());
                    } else if (string.equals("*")) {
                        RPNStack.push(RPNStack.pop() * RPNStack.pop());
                    } else if (string.equals("/")) {
                        RPNStack.push(1/RPNStack.pop() * RPNStack.pop());
                    } else {
                        RPNStack.push(Double.parseDouble(string));
                        //RPNStack.push( RPNStack.pop() / RPNStack.pop() );
                    }
                }
                System.out.print(RPNStack.pop() + "\n");
            }
            if (RPNStack.empty()) System.out.println("Stack is empty!\n");
      //  }

    }
}