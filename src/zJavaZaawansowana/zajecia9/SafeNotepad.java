package zJavaZaawansowana.zajecia9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SafeNotepad {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("test.txt");
            outputStream = new FileWriter("test2.txt");

            int c;
            while ((c = inputStream.read()) != -1) {

                char x = (char) c;
                if (x == ' ') {
                    System.out.print(" ");
                } else {
                    System.out.print((char) (c + 5));
                    outputStream.write((char) (c + 5));
                }

            }


        } catch (
                IOException e) {
            System.err.println("Problem z plikiem: " + e.getMessage());

        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }

        }
    }
}
