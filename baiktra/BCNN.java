import java.util.Scanner;

public class BCNN {
    public static void main(String[] args) {
        int a,b,bcnn;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat: ");
        a = sc.nextInt();
        System.out.println("nhap vao so thu hai: ");
        b = sc.nextInt();
        bcnn = (a>b) ? a : b;
        while(true) {
            if( bcnn % a == 0 && bcnn % b == 0 ) {
                System.out.printf("Boi chung nho nhat cua %d và %d là %d.", a, b, bcnn);
                break;
              }
              ++bcnn;
        }
    }
}
