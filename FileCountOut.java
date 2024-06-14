import java.io.FileInputStream;
import java.io.*;
import java.util.*;

public class FileCountOut {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the name of the file"); 
            String fileName = scanner.nextLine();
            FileInputStream fin = new FileInputStream(fileName);

            int characters = 0, words = 0, lines = 0;
            char letter;
            while (fin.available() > 0) {
                letter = (char) fin.read();
                characters++;

                if (letter == '\n')
                    lines++;
                if (letter == ' ' ||  letter == '\t')
                    words++;
            }

            if (characters > 0) {
                words++;
                lines++;
            }

            System.out.println("Number of Characters: " + characters);
            System.out.println("Number of Words: " + words);
            System.out.println("Number of Lines: " + lines);

            fin.close();
        } 
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

