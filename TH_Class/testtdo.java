import java.lang.Math;
import java.util.Scanner;

class Toado {
    double x,y;
    Toado (double x,double y){
        this.x=x;
        this.y=y;
    }
    public  void setx(double x) {
        this.x=x;
    }
    public  double getx() {
        return x;
    }
    public  void sety(double y) {
        this.y=y;
    }
    public  double gety() {
        return y;
    }    
}

public class testtdo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap toa do diem thu nhat (x,y)= ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Toado a=new Toado(x,y);
        System.out.print("Nhap toa do diem thu hai (x,y)= ");
         x = scanner.nextInt();
         y = scanner.nextInt();
        Toado b=new Toado(x,y);

        double kq=Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
        System.out.println(kq);
    }
}
