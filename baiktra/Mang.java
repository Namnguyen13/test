import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang: ");
        int n = sc.nextInt();
        
        int []mang = new int[n];
        for ( int  i = 0; i < mang.length; i++) {
            System.out.println("nhap vao gia tri thu "+i+" : ");
            mang[i] = sc.nextInt();
        }

        System.out.println("Cac so le co trong mang vua nhap la: ");
            for(int i = 0; i < n ; i++){
                if(mang[i] % 2 !=0){
                    System.out.println(mang[i] +" ");
                }
            }
    }
}
