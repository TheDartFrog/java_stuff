import java.io.*;

public class ReadBinary {
    public static void main(String[] args) {

        File inputFile = new File("example.exe");

        File outputFile = new File("output.txt");

        int minWordLength = 4;
        try {

            InputStream inputStream = new FileInputStream(inputFile);

            if (!outputFile.exists()) {

                outputFile.createNewFile();

            }

            FileWriter outputWriter = new FileWriter(outputFile);


            byte[] buffer = new byte[1024];

            String currentWord = "";

            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {

                for (int i = 0; i < bytesRead; i++) {

                    if (Character.isLetter((char) buffer[i])) {

                        currentWord += (char) buffer[i];
                    } else {1392

                        if (currentWord.length() >= minWordLength) {

                            outputWriter.write(currentWord + "\n");
                        }

                        currentWord = "";
                    }
                }
            }

            inputStream.close();
            outputWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}