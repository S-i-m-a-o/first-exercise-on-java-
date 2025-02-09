//Guilherme Simao 3137464
package Griffith;

public class Product implements Comparable<Product> {
    // Static field to auto-increment product code
    private static int codeCounter = 0;

    // Attributes
    private final int code;  // Code is unique and does not need a setter
    private String title;
    private double price;

    // Constructor
    public Product(String title, double price) {
        this.code = ++codeCounter; // Automatically assign and increment the code
        this.title = title;
        this.price = price;
    }

    // Getters
    public int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Override toString to provide a product description
    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    // Override equals method to compare products by their code
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check for same object reference
        if (obj == null || getClass() != obj.getClass()) return false; // Type check
        Product product = (Product) obj;
        return code == product.code; // Compare by code
    }

    // Override hashCode to be consistent with equals
    @Override
    public int hashCode() {
        return Integer.hashCode(code); // Use the hash of the code
    }

    // Implement compareTo to compare products by title
    @Override
    public int compareTo(Product other) {
        if (other == null) throw new NullPointerException("Other product cannot be null");
        return this.title.compareTo(other.title); // Compare titles lexicographically
    }
}
