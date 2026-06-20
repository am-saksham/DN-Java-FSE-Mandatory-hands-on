public abstract class DocumentFactory {
    public abstract Document createDocument();

    public void processDocument() {
        Document doc = createDocument();
        doc.open();
        System.out.println("Processing document data...");
        doc.close();
        System.out.println("-------------------------");
    }
}
