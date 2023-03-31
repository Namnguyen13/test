import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;


class Product {
    private String code;
    private String name;
    private String shortDescription;
    private String longDescription;
    private ArrayList<Option> options;
    
    public Product(String code, String name, String shortDescription, String longDescription) {
        this.code = code;
        this.name = name;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.options = new ArrayList<Option>();
    }
    
    public void addOption(String name, double price) {
        Option option = new Option(name, price);
        options.add(option);
    }
    
    public void editOption(int index, String newName, double newPrice) {
        Option option = options.get(index);
        option.setName(newName);
        option.setPrice(newPrice);
    }
    
    public void printDetails() {
        System.out.println("Mã sản phẩm : " + code);
        System.out.println("Tên sản phẩmv: " + name);
        System.out.println("Mô tả ngắn : " + shortDescription);
        System.out.println("Mô tả chi tiết : " + longDescription);
        System.out.println("Lựa chọn :");
        for (Option option : options) {
            System.out.println(option.getName() + " - $" + option.getPrice());
        }
    }
    
    private class Option {
        private String name;
        private double price;
        
        public Option(String name, double price) {
            this.name = name;
            this.price = price;
        }
        
        public String getName() {
            return name;
        }
        
        public double getPrice() {
            return price;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public void setPrice(double price) {
            this.price = price;
        }
    }
}

public class RunProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin sản phẩm
        System.out.print("Nhập mã sản phẩm: ");
        String code = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập mô tả ngắn: ");
        String shortDescription = scanner.nextLine();
        System.out.print("Nhập mô tả dài: ");
        String longDescription = scanner.nextLine();

        // Tạo đối tượng sản phẩm
        Product product = new Product(code, name, shortDescription, longDescription);

        // Nhập và thêm các tùy chọn cho sản phẩm
        System.out.print("Nhập số lượng tùy chọn: ");
        int numOptions = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ kí tự '\n' sau khi đọc số lượng tùy chọn
        for (int i = 0; i < numOptions; i++) {
            System.out.print("Nhập tên tùy chọn thứ " + (i + 1) + ": ");
            String optionName = scanner.nextLine();
            System.out.print("Nhập giá tùy chọn thứ " + (i + 1) + ": ");
            double optionPrice = scanner.nextDouble();
            scanner.nextLine(); // Đọc bỏ kí tự '\n' sau khi đọc giá tùy chọn
            product.addOption(optionName, optionPrice);
        }

        System.out.println("-------------------");
        // Hiển thị chi tiết sản phẩm
        System.out.println("Chi tiết sản phẩm:");
        product.printDetails();

        // Chỉnh sửa tùy chọn
        System.out.print("Nhập số thứ tự tùy chọn cần chỉnh sửa (bắt đầu từ 1): ");
        int optionIndex = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ kí tự '\n' sau khi đọc số thứ tự tùy chọn
        System.out.print("Nhập tên mới cho tùy chọn: ");
        String newOptionName = scanner.nextLine();
        System.out.print("Nhập giá mới cho tùy chọn: ");
        double newOptionPrice = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ kí tự '\n' sau khi đọc giá mới cho tùy chọn
        product.editOption(optionIndex - 1, newOptionName, newOptionPrice);

        // Hiển thị lại chi tiết sản phẩm sau khi chỉnh sửa tùy chọn
        System.out.println("Chi tiết sản phẩm sau khi chỉnh sửa tùy chọn:");
        product.printDetails();

        scanner.close();
    }
}
