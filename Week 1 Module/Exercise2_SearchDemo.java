import java.util.*;

class SearchProduct {
    int productId;
    String productName;
    String category;

    SearchProduct(int id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }
}

public class SearchDemo {
    public static int linearSearch(SearchProduct[] products, String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(name)) return i;
        }
        return -1;
    }

    public static int binarySearch(SearchProduct[] products, String name) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);
            if (cmp == 0) return mid;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchProduct[] products = {
            new SearchProduct(1, "Apple", "Fruits"),
            new SearchProduct(2, "Banana", "Fruits"),
            new SearchProduct(3, "Carrot", "Vegetables")
        };
        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        System.out.println("Linear Search for 'Banana': " + linearSearch(products, "Banana"));
        System.out.println("Binary Search for 'Carrot': " + binarySearch(products, "Carrot"));
    }
}

/*
Output:
Linear Search for 'Banana': 1
Binary Search for 'Carrot': 2
*/