import java.util.Arrays;
import java.util.Scanner;

public class ListNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập dãy số thực
        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextDouble();
        }

        // Hiển thị dãy đã nhập
        System.out.println("Dãy số đã nhập: " + Arrays.toString(arr));

        // Sắp xếp dãy số
        Arrays.sort(arr);

        // Hiển thị dãy đã sắp xếp
        System.out.println("Dãy số đã sắp xếp: " + Arrays.toString(arr));

        // Tính trung bình cộng của dãy số
        double sum = 0.0;
        for (double num : arr) {
            sum += num;
        }
        double average = sum / arr.length;

        // Hiển thị trung bình cộng của dãy số
        System.out.println("Trung bình cộng của dãy số: " + average);

        scanner.close();
    }
}
