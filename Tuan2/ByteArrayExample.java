import java.io.*;

public class ByteArrayExample {
    public static void main(String[] args) throws IOException {
       
        byte[] byteArray = new byte[100];
        
        
        System.out.println("Nhập dữ liệu cho mảng byte:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < byteArray.length; i++) {
            byteArray[i] = Byte.parseByte(br.readLine());
        }
        
        ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
        System.out.println("Dữ liệu đã nhập cho mảng byte:");
        int data;
        while ((data = bais.read()) != -1) {
            System.out.print(data + " ");
        }
    }
}
