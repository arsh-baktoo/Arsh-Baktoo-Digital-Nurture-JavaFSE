public class FactoryMethodPatternExample {
    public static void main(String[] args) {

        DocumentFactory wf = new WordFactory();
        wf.createDocument().open();

        DocumentFactory pf = new PdfFactory();
        pf.createDocument().open();

        DocumentFactory ef = new ExcelFactory();
        ef.createDocument().open();
    }
}