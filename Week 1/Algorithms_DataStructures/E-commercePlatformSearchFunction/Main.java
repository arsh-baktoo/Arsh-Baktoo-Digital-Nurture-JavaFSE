public class Main {

    public static void main(String[] args) {

        Product[] p = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories")

        };

        Product a = Search.linear(p, "Phone");

        System.out.println("Linear Search");

        if (a != null)
            a.show();
        else
            System.out.println("Product Not Found");

        Product b = Search.binary(p, "Phone");

        System.out.println("\nBinary Search");

        if (b != null)
            b.show();
        else
            System.out.println("Product Not Found");
    }
}