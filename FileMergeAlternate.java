import java.io.*;

public class FileMergeAlternate {
    public static void main(String[] args) {
        String file1Name = "1.txt";
        String file2Name = "2.txt";
        String outputFileName = "merged_file_alternate.txt";
        
        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1Name));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2Name));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            String line1;
            String line2 = null;
            
            while ((line1 = reader1.readLine()) != null || (line2 = reader2.readLine()) != null) {
                if (line1 != null) {
                    writer.write(line1);
                    writer.newLine();
                }
                
                if (line2 != null) {
                    writer.write(line2);
                    writer.newLine();
                }
            }
            
            System.out.println("Files merged successfully.");
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } 
        catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
        }
    }
}
