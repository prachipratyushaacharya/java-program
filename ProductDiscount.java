import java.util.Scanner;

public class ProductDiscount {
    public static void main(String[] args) {
        Product.productArr[0] = new Product("Coco-Cola", 1, 10.00, 100);
        Product.productArr[1] = new Product("Sprite", 2, 10.00, 100);
        Product.productArr[2] = new Product("Mazza", 3, 15.00, 100);
        Product.productArr[3] = new Product("Limca", 4, 10.00, 100);
        Product.productArr[4] = new Product("Pepsi", 5, 10.00, 100);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the product id: ");
        int tempID = scan.nextInt();
        System.out.print("Enter the discount: ");
        double tempDiscount = scan.nextDouble();

        Product.applyDiscount(tempDiscount, tempID);
        scan.close();
    }
}
