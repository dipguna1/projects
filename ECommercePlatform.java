import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private ArrayList<Product> items = new ArrayList<>();

    public void addItem(Product product) {
        items.add(product);
    }

    public boolean removeItem(int productId) {
        for (Product item : items) {
            if (item.getId() == productId) {
                items.remove(item);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Product> getItems() {
        return items;
    }
}

class ECommercePlatform {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        ArrayList<Product> products = new ArrayList<>();

        // Sample products
        products.add(new Product(1, "Product A", 10.0));
        products.add(new Product(2, "Product B", 20.0));
        products.add(new Product(3, "Product C", 15.0));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== E-Commerce Platform ===");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Display Products");
            System.out.println("4. Generate Invoice");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID to add to cart: ");
                    int productId = scanner.nextInt();
                    Product selectedProduct = getProductById(products, productId);
                    if (selectedProduct != null) {
                        cart.addItem(selectedProduct);
                        System.out.println("Product added to cart.");
                    } else {
                        System.out.println("Invalid Product ID.");
                    }
                    break;
                case 2:
                    System.out.print("Enter Product ID to remove from cart: ");
                    int removeProductId = scanner.nextInt();
                    boolean removed = cart.removeItem(removeProductId);
                    if (removed) {
                        System.out.println("Product removed from cart.");
                    } else {
                        System.out.println("Product not found in cart.");
                    }
                    break;
                case 3:
                    System.out.println("=== Available Products ===");
                    for (Product product : products) {
                        System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Price: $"
                                + product.getPrice());
                    }
                    break;
                case 4:
                    ArrayList<Product> invoiceItems = cart.getItems();
                    double totalAmount = 0.0;
                    System.out.println("=== Invoice ===");
                    for (Product item : invoiceItems) {
                        System.out.println("Product: " + item.getName() + ", Price: $" + item.getPrice());
                        totalAmount += item.getPrice();
                    }
                    System.out.println("Total Amount: $" + totalAmount);
                    break;
                case 5:
                    System.out.println("Exiting the platform.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static Product getProductById(ArrayList<Product> products, int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }
}