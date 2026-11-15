class FoodOrder {

    public static double getFoodPrice(String foodName) {

        if (foodName.equals("Pizza")) {
            return 200;
        }
        else {
            return 500;
        }
    }

    public static double calculateTotal(String foodName, int quantity) {

        double price = getFoodPrice(foodName);
        double total = price * quantity;

        return total;
    }

    public static void main(String[] args) {

        double result = calculateTotal("Brger", 2);

        System.out.println("Total Amount: " + result);
    }
}