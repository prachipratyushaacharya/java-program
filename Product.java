/* Design a class called Product to represent items on an e-commerce site. The 
class should include fields for productName, productID, price, and 
quantityInStock.
   -How would you implement a method to apply a discount to a product and 
update its price accordingly*/

import java.util.Scanner;

class Product {

    String productName;
    int productID;
    double price;
    int quantityInStock;

    private static final int MAX_PRODUCT = 5;
    static Product productArr[] = new Product[MAX_PRODUCT];

    Product(String productName, int productID, double price, int quantityInStock) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    // method to apply discount
    static void applyDiscount(double discount, int id) {
        for (int i = 0; i < productArr.length; i++) {
            if (id == productArr[i].productID) {
                if (discount > 100 || discount < 0) {
                    System.out.println("Invalid discount");
                    return;
                }
                productArr[i].price -= productArr[i].price * (discount / 100);
                System.out.println("Updated price: " + productArr[i].price);
            }
        }
    }
}
