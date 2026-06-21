import java.util.Arrays;

public class Main {
    public static Product linearSearch(Product[] products, String targetName) {
        for(Product p : products) {
            if(p.getProductName().equalsIgnoreCase(targetName)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0;
        int right = products.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductName().compareToIgnoreCase(targetName);

            if(comparison == 0) {
                return products[mid];
            } else if(comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] inventory = {
            new Product(101, "Wireless Mouse", "Electronics"),
            new Product(102, "Mechanical Keyboard", "Electronics"),
            new Product(103, "Desk Lamp", "Home & Office"),
            new Product(104, "Coffee Mug", "Kitchen"),
            new Product(105, "Gaming Monitor", "Electronics")
        };

        System.out.println("--- E-Commerce Search Platform ---");

        System.out.println("\nExecuting Linear Search for 'Coffee Mug'...");
        Product foundLinear = linearSearch(inventory, "Coffee Mug");
        System.out.println(foundLinear != null ? "Found: " + foundLinear : "Product not found.");

        System.out.println("\nSorting inventory for Binary Search...");
        Arrays.sort(inventory);

        System.out.println("Executing Binary Search for 'Desk Lamp'...");
        Product foundBinary = binarySearch(inventory, "Desk Lamp");
        System.out.println(foundBinary != null ? "Found: " + foundBinary : "Product not found.");
    }
}
