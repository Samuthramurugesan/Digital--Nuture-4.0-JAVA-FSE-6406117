package src;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "Smartphone", "Electronics"),
            new Product(4, "T-shirt", "Clothing"),
            new Product(5, "Watch", "Accessories")
        };

        System.out.println("Linear Search Result:");
        Product linearResult = ProductSearch.linearSearch(products, "Shoes");
        System.out.println(linearResult != null ? linearResult : "Product not found");

        System.out.println("\nBinary Search Result:");
        Product binaryResult = ProductSearch.binarySearch(products, "Shoes");
        System.out.println(binaryResult != null ? binaryResult : "Product not found");
    }
}
