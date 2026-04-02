package gla.com.wrapper_class;

public class ShoppingCart {
    public static void main(String[] args) {
        // Prices stored as strings
        String[] prices = {"250", "499", "99", "abc", "150"};

        int totalPrice = 0;

        for (String price : prices) {
            try {
                // Convert string to integer
                int value = Integer.parseInt(price);
                totalPrice += value;
            } catch (NumberFormatException e) {
                // Handling invalid price
                System.out.println("Invalid price found: " + price);
            }
        }

        System.out.println("Total Price: " + totalPrice);
    }
}
