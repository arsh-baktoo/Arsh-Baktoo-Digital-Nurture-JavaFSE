public class Product {

    int id;
    String name;
    String cat;

    Product(int id, String name, String cat) {
        this.id = id;
        this.name = name;
        this.cat = cat;
    }

    void show() {
        System.out.println(id + "  " + name + "  " + cat);
    }
}