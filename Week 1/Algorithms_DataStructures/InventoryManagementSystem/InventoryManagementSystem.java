import java.util.*;

public class InventoryManagementSystem {

    static HashMap<Integer, Product> inventory = new HashMap<>();

    static void addProduct(Product p) {
        inventory.put(p.productId, p);
        System.out.println("Product Added");
    }

    static void updateProduct(int id, int qty, double price) {
        Product p = inventory.get(id);

        if (p != null) {
            p.quantity = qty;
            p.price = price;
            System.out.println("Product Updated");
        } else {
            System.out.println("Product Not Found");
        }
    }

    static void deleteProduct(int id) {
        inventory.remove(id);
        System.out.println("Product Deleted");
    }

    static void displayProducts() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        addProduct(new Product(101, "Laptop", 20, 50000));
        addProduct(new Product(102, "Mouse", 100, 500));

        updateProduct(101, 25, 52000);

        deleteProduct(102);

        displayProducts();
    }
}