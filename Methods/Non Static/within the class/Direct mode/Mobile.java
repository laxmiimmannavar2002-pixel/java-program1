 class Mobile {

    public void displayBrand() {
        System.out.println("Brand: Samsung");
    }

    public void displayModel() {
        System.out.println("Model: S24");
    }

    public void displayPrice() {
        System.out.println("Price: 50000");
    }

    public static void main(String[] args) {
        new Mobile().displayBrand();
		new Mobile().displayModel();
		new Mobile().displayPrice();
    }
}