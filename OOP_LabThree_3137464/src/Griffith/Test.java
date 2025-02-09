//Guilherme Simao 3137464
package Griffith;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        // Set a deadline
        DeadLine deadline = new DeadLine(LocalDate.of(2024, 12, 1));

        // Get the singleton instance of AssignmentSubmission
        AssignmentSubmission submissionManager = AssignmentSubmission.getInstance(deadline);

        // Create assessments
        Assessment assessment1 = new Assessment("Math Homework", "Solve equations", LocalDate.now());
        Assessment assessment2 = new Assessment("Science Project", "Build a volcano model", LocalDate.now());

        // Submit the first assessment before the deadline
        submissionManager.submit(assessment1);
        System.out.println("After first submission:");
        System.out.println(assessment1);

        // Submit the first assessment again (as an update)
        submissionManager.submit(assessment1);
        System.out.println("After updating the first submission:");
        System.out.println(assessment1);

        // Submit the second assessment after the deadline
        // Simulate this by changing the system date (or pretend it's late)
        Assessment lateAssessment = new Assessment("History Essay", "Write about WWII", LocalDate.now().plusDays(10));
        submissionManager.submit(lateAssessment);
        System.out.println("After submitting late:");
        System.out.println(lateAssessment);

        // Print all submissions
        System.out.println("All submissions:");
        for (Assessment a : submissionManager.getAssessments()) {
            System.out.println(a);
        }
        // Create 4 products with different titles, at least two with the same price
        Product product1 = new Product("Laptop", 1200.99);
        Product product2 = new Product("Phone", 799.49);
        Product product3 = new Product("Tablet", 799.49); // Same price as product2
        Product product4 = new Product("Headphones", 150.00);

        // Print the products
        System.out.println("Created Products:");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);

        // Create an ArrayList called order
        ArrayList<Product> order = new ArrayList<>();

        // Add two of the same products using a copy constructor or clone
        order.add(product1); // Add product1
        order.add(new Product(product1.getTitle(), product1.getPrice())); // Copy product1
        order.add(product2);
        order.add(product3);
        order.add(product4);

        // Print the order list before sorting
        System.out.println("\nOrder list before sorting:");
        for (Product p : order) {
            System.out.println(p);
        }

        // Test equals and hashCode
        System.out.println("\nTesting equals and hashCode:");
        System.out.println("product1 equals product2? " + product1.equals(product2)); // Should be false
        System.out.println("product1 equals its copy? " + product1.equals(order.get(1))); // Should be true
        System.out.println("product1 hashCode: " + product1.hashCode());
        System.out.println("product1 copy hashCode: " + order.get(1).hashCode());

        // Sort the list using Collections.sort
        Collections.sort(order);

        // Print the order list after sorting
        System.out.println("\nOrder list after sorting:");
        for (Product p : order) {
            System.out.println(p);
        } 
    }
}
