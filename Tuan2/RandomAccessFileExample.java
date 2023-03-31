import java.io.*;
import java.util.Random;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("dayso.dat");

            int[] numbers = new int[10];
            Random rand = new Random();
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = rand.nextInt(100);
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            for (int i = 0; i < numbers.length; i++) {
                raf.writeInt(numbers[i]);
            }
            raf.close();

            raf = new RandomAccessFile(file, "r");
            while (raf.getFilePointer() < raf.length()) {
                int num = raf.readInt();
                System.out.print(num + " ");
            }
            raf.close();
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
