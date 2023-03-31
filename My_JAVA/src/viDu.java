import java.util.Scanner;
import java.lang.Math;
/* 
public class viDu{
    public static void main(String[] args) {
        System.out.println("Chao mung den voi nhung vi du cua toi");
    }
}
*/

/* 
public class viDu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("nhap vao so n");
        n = scanner.nextInt();
        System.out.println("so n vua nhap la:"+n);
    }
}
*/

/* 
public class viDu{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("nhap vao so a:");
        a = scanner.nextInt();
        System.out.println("Nhap vao so b:");
        b = scanner.nextInt();
        if (a>b) {
            System.out.println(a+">"+b);            
        } else {
            System.out.println(a+"<"+b);
        }
    }
}

*/

/* 
public class viDu{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao thu de hien thi");
        n = scanner.nextInt();
        switch(n){
            case 2: System.out.println("Thu Hai");  break;
            case 3: System.out.println("Thu Ba");   break;
            case 4: System.out.println("Thu Tu");   break;
            case 5: System.out.println("Thu Nam");  break;
            case 6: System.out.println("Thu Sau");   break;
            case 7: System.out.println("Thu Bay");  break;
            case 8: System.out.println("Chu Nhat");   break;
            default:
                System.out.println("thu ban vua nhap khong hop le");    break;
        }
    }
}
*/


/*
//giai pt bac nhat ax+b=0
/**
 * ax+b=0
 * a=0,b=0 =>pt vo so nghiem
 * a!=0 =>pt co nghiem x= -b/a
 */ /* 
public class viDu{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,x;
        System.out.println("Nhap vao gia tri a:");
        a = scanner.nextDouble();
        System.out.println("Nhap vao gia tri b:");
        b = scanner.nextDouble();
        x = (-b)/a;
        if (a==0 && b==0) {
            System.out.println("phuong trinh vo so nghiem");
        }else if(a==0 && b!=0){
            System.out.println("phuong trinh vo nghiem");
        }else{
            System.out.println("phuong trinh co nghiem: x= "+x);
        }
    }
}
*/


/* 
//giai pt bac 2 ax^2+bx+c=0
/**
 * delta = (b^2) -4ac
 * delta < 0 => pt vo nghiem
 * delta = 0 => pt co nghiem kep x= (-b)/2a
 * delta > 0 => pt co 2 nghiem pb x1 = ((-b)+sqrt(delta))/(2*a), x2 = ((-b)-sqrt(delta))/(2*a) 
 * a=0 => x=-c/b 
 */ /* 

public class viDu{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c,delta,x,x1,x2,x3;
        System.out.println("nhap vao gia tri a:");
        a = scanner.nextDouble();
        System.out.println("nhap vao gia tri b:");
        b = scanner.nextDouble();
        System.out.println("nhap vao gia tri c:");
        c = scanner.nextDouble();
        delta = Math.pow(b, 2)-(4*a*c);
        x=-c/b;
        x1= ((-b)+Math.sqrt(delta))/(2*a);
        x2= ((-b)-Math.sqrt(delta))/(2*a);
        x3= -b/(2*a);
        if(a==0){
            System.out.println("pt co nghiem: x="+x);
        }else if (delta<0) {
            System.out.println("pt vo nghiem");
        }else if(delta==0){
            System.out.println("pt co nghiem kep: x1=x2="+x3);
        }else if(delta>0) {
            System.out.println("pt co hai nghiem pb:");
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }
    }
}
*/


/* 
//kiem tra so ngay trong thang 
public class viDu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t,n;
        System.out.println("nhap vao thang ban muon kiem tra");
        t = scanner.nextInt();
        System.out.println("nhap vao nam ban muon kiem tra");
        n = scanner.nextInt();
        switch(t){
            case 1: 
            case 3:
            case 5:
            case 7:
            case 8: 
            case 10:
            case 12:
                System.out.println("Thang co 31 ngay");
                    break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang co 30 ngay");
                    break;
            case 2:
                if(n%4==0 && n%100 !=0 || n%400==0){
                    System.out.println("Thang co 29 ngay"); 
                } else{
                    System.out.println("Thang co 28 ngay");
                }
                break;
                    default:
                        System.out.println("so thang ban vua nhap khong hop le");
                            break;
                    }
    }
}
*/

/* 
//su dung vong lap co ban
public class viDu{
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i+". anh yeu em");
        }
    }
}
*/

/* 
//su dung vong lap for long nhau
public class viDu{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("nhap vao bang cuu chuong ban muon hien thi");
        n = scanner.nextInt();
            for(int i=n;i<=n;i++){
                for(int j=1;j<=10;j++){
                    System.out.println(i+" x " +j+" = "+(i*j));
                }
            System.out.println("--------");
        }
    }
}
*/


/*
//vi du ve vong lap while
public class viDu{
    public static void main(String[] args) {
        int x=1;
        Scanner scanner = new Scanner(System.in);
        while (x!=0) {
            System.out.println("Nhap vao so 0 de thoat");
            System.out.println("Nhap vao so khac de tiep tuc");
            x = scanner.nextInt();
        }
        int i = 0;
        while (true){
            System.out.println(i);
            i++;
            if(i==10){
                break;
            }
        }
    }
}

*/


/*
//chuyen so he thap phan sang he nhi phan 
public class viDu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao so nguyen n > 0");
        n = scanner.nextInt();
        String nhiPhan = "";
        while (n>0) {
            nhiPhan = (n%2) + nhiPhan;
            n = n/2;
        }
        System.out.println("so n vua nhap co he nhi phan la: "+nhiPhan);
    }
}
*/

/* 
//vong lap do while
public class viDu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.println("nhap vao so a khac 0 de co pt bac 2");
            n = scanner.nextInt();
        } while(n==0);
    }
}
*/

/* 
//nhap vao 1 so nguyen duong n tinhs tong cac so chan trong khoang 0-n
public class viDu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum=0;
        System.out.println("Nhap vao so nguyen n:");
        n = scanner.nextInt();
        for(int i= 0;i<=n;i+=2){
            sum+=i;
        }
        System.out.println("tong cac so chan la: "+sum);
    }
}

*/


/* 
public class viDu{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int tich = 0;
        System.out.println("Nhap vao 1 so nguyen n:");
        n = scanner.nextInt();
        for (int i = 1; i < 20; i++) {
            tich=n*i;
            System.out.println(+n+" x "+i+"="+tich);
        }
    }
}
*/

/* 
//kiem tra co la so nguyen to hay khong

public class viDu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        boolean kiemTra=true;
        System.out.println("Nhap vao so n de kiem tra co la so nguyen to khong");
        n = scanner.nextInt();
        if(n<2){
            System.out.println(n+" khong la so nguyen to");
        }
        for (int i = 2; i < n/2; i++) {
            if(n%i==0){
                System.out.println(n+" khong la so nguyen to");
                kiemTra = false;
                break;
            }
        }
        if(kiemTra)
            System.out.println(n+" la so nguyen to");
        }
}

*/
/*
//bắt lỗi ngoại lệ try catch finally

public class viDu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        try {
            System.out.println("nhap vao gia tri n:");
            n = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("nhap gia tri n khong dung");
        } finally{
            System.out.println("Finally!");
        }
        System.out.println("gia tri n vua nhap la: "+n);
        System.out.println("Ket thuc truong trinh!");
    }
}

//vidu
public class viDu{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b;
        double c = 0;
        try {
            System.out.println("Nhap vao gia tri a: ");
            a = scanner.nextDouble();
            System.out.println("Nhap vao gia tri b: ");
            b = scanner.nextDouble();
            c = a/b ;
        } catch (Exception e) {
            System.out.println("nhap sai gia tri cua b");
        }
        System.out.println("Ket qua phep tinh la: "+c);
    }
}
*/


/* 
//khai báo mảng và tính tổng các giá trị trong mảng vừa nhập

public class viDu {
    public static void main(String[] args) {
        double mang1[];
        double mang2[];
        mang1 = new double[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mang1.length; i++) {
            System.out.println("nhap vao gia tri thu "+i+" : ");
            mang1[i] = sc.nextDouble();
        }
        double tong = 0;
        for (int i = 0; i < mang1.length; i++) {
            tong+=mang1[i];
        }
        System.out.println("tong cac so trong mang la: "+tong);
        System.out.println("mang 2:");
        mang2 = new double[]{1,2,3,4,5};
        for (int i = 0; i < mang2.length; i++) {
            System.out.println(mang2[i]);
        }
    }
}

*/  
/* 
//nhập và suất ma trận 
public class viDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hang,cot;
        System.out.println("Nhap vao so hang cua ma tran: ");
        hang = sc.nextInt();
        System.out.println("Nhap vao so cot cua ma tran: ");
        cot = sc.nextInt();
        int arr[][] = new int[hang][cot];
        System.out.println("Nhap cac phan tu trong ma tran: ");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf("a[%d][%d] = ",i,j);
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(+arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
*/

/*
public class viDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mang1[];
        mang1 = new double[10];
        for (int i = 0; i < mang1.length; i++) {
            System.out.println("nhap vao mang phan tu so " +i+ " :");
            mang1[i]=sc.nextDouble();            
        }
        double tong=0;
        for (int i = 0; i < mang1.length; i++) {
            tong+=mang1[i];
        }
        System.out.println("tong ma tran la: "+tong);
    }
}
*/

/*
public class viDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean kiemTra = true;
        System.out.println("nhap vao mot so de kiem tra xem co la so nguyen to khong ");
        n = sc.nextInt();
        if(n<2){
            System.out.println(n+" khong la so nguyen to!");
        }
        for (int i = 2; i < n/2; i++) {
            if(n%i==0){
                System.out.println(n+" khong la so nguyen to!");
                kiemTra=false;
                break;
            }
        }
        if(kiemTra){
            System.out.println(n+" la so nguyen to");
        }
    }
}
*/

