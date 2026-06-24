public class Main {

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Watch", "Accessories"),
            new Product(104, "Phone", "Electronics"),
            new Product(105, "Tablet", "Electronics")
        };

        int searchId = 103;

        System.out.println("Linear Search Result:");
        Product result1 = SearchAlgorithms.linearSearch(products, searchId);

        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product not found");
        }

        System.out.println("\nBinary Search Result:");
        Product result2 = SearchAlgorithms.binarySearch(products, searchId);

        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product not found");
        }
    }
}