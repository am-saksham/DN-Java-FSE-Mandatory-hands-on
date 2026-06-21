public class Main {
    public static void main(String[] args) {
        
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started.");
        logger2.log("Connecting to the database...");

        if (logger1 == logger2) {
            System.out.println("\nSUCCESS: Both variables hold the same Logger instance.");
            System.out.println("logger1 HashCode: " + logger1.hashCode());
            System.out.println("logger2 HashCode: " + logger2.hashCode());
        } else {
            System.out.println("\nFAILURE: Different instances were created.");
        }
    }
}