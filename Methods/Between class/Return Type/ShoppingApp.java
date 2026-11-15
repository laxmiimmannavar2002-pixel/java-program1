class ShoppingApp {

    public static double calculateTotal(int quantity, double price) {

        double total = quantity * price;

        return total;
    }

    public static double calculateDiscount(double totalAmount) {

        double discount = totalAmount * 10 / 100;

        return discount;
    }

    public static void main(String[] args) {

        double total = calculateTotal(3, 500);

        double discount = calculateDiscount(total);

        double finalAmount = total - discount;

        System.out.println("Total Amount: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }
}