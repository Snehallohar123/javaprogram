import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class Readwrite {
    public static void main(String[] args) {
        String filename;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the filename:");
        filename = sc.nextLine();

        // Reading the file
        try (FileInputStream fstream = new FileInputStream(filename)) {
            int i;
            System.out.println("File content:");
            while ((i = fstream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        // Asking if the user wants to add new content
        System.out.println("\nDo you want to add new content to the file? (yes/no)");
        String response = sc.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Add some content:");
            String content = sc.nextLine();

            // Appending content to the file
            try (FileOutputStream fostream = new FileOutputStream(filename, true)) {
                byte[] bytes = content.getBytes();
                fostream.write(bytes);
                System.out.println("The content was added successfully.");
            } catch (IOException e) {
                System.out.println("Error adding content: " + e.getMessage());
            }
        }

        sc.close();
    }
}
