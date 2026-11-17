class ElectricityBill {

    public void calculateBill(int units, int cost) {
        int bill = units * cost;
        System.out.println("Total Bill: " + bill);
    }

    public static void main(String[] args) {
        new ElectricityBill().calculateBill(100,5);
		new ElectricityBill().calculateBill(200,7);
    }
}