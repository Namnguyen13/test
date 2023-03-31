import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        String file = "example.txt";
        String content = "Hello, World!";

        try {
            FileOutputStream outputStream = new FileOutputStream(file);
            byte[] bytes = content.getBytes();
            outputStream.write(bytes);
            outputStream.close();
            // System.out.println("File " + file + " has been written successfully!");
        } catch (IOException e) {
            System.err.println("Error writing to file " + file + ": " + e.getMessage());
        }

        try {
            FileInputStream inputStream = new FileInputStream(file);
            int data;
            StringBuilder sb = new StringBuilder();
            while ((data = inputStream.read()) != -1) {
                sb.append((char) data);
            }
            inputStream.close();
            System.out.println(sb.toString());
        } catch (IOException e) {
            System.err.println("Error reading from file " + file + ": " + e.getMessage());
        }
    }
}
