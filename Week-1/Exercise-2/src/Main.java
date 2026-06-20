public class Main {
    public static void main(String[] args) {
        System.out.println("--- Document Management System ---");

        // 1. Create a Word Document
        DocumentFactory wordFactory = new WordFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();
        wordDoc.close();

        System.out.println("\n--- Processing via Factory Method directly ---");

        // 2. Process a PDF using the abstract factory's shared method
        DocumentFactory pdfFactory = new PdfFactory();
        pdfFactory.processDocument();

        // 3. Process an Excel Document
        DocumentFactory excelFactory = new ExcelFactory();
        excelFactory.processDocument();
    }
}