import java.util.ArrayList;
import javax.swing.JOptionPane;

public class InventoryApp {
    public static void main(String[] args) {
        // Create Product objects
        Product iPhone18Pro = new Product("iPhone 18 Pro", 1199.00, 1000);
        Product appleWatchSeries12 = new Product("Apple Watch Series 12", 399.00, 400);
        Product macBookPro = new Product("Macbook Pro", 1999.00, 300);
        Product airPods5 = new Product("AirPods 5", 129.00, 2000);

        // Calculate value of each product and add to get total inventory value
        double total = 
            iPhone18Pro.calculateInventoryValue() +
            appleWatchSeries12.calculateInventoryValue() +
            macBookPro.calculateInventoryValue() + 
            airPods5.calculateInventoryValue();

        // Add each product to an ArrayList to enable forEach method
        ArrayList<Product> products = new ArrayList<>();
        products.add(iPhone18Pro);
        products.add(appleWatchSeries12);
        products.add(macBookPro);
        products.add(airPods5);

        // Use StringBuilder so product information and inventory total can be combined into one string for JOptionPane
        StringBuilder inventory = new StringBuilder();

        // Print product information to console for each product and append to the inventory string
        products.forEach(product -> {
            System.out.printf("Product: %s\n" + "Price: $%.2f\n" + "Quantity: %d\n\n", product.getName(), product.getPrice(), product.getQuantity());
            inventory.append(String.format("Product: %s\n" + "Price: $%.2f\n" + "Quantity: %d\n\n", product.getName(), product.getPrice(), product.getQuantity()));
        });

        // Print total value to console and append to inventory string
        System.out.printf("Total Inventory Value: $%.2f", total);
        inventory.append(String.format("Total Inventory Value: $%.2f", total));

        // Display dialog pane with inventory string
        JOptionPane.showMessageDialog(null, inventory);
    }
}
