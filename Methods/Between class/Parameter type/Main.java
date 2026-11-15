class Transport {

    public static void showTimings() {

        System.out.println("Bus Timing: 9:00 AM");
        System.out.println("Bus Timing: 5:00 PM");

    }

    public static void calculateFare(int km) {

        System.out.println("Total Fare: " + (km * 10));

    }
}
class Main {

    public static void main(String[] args) {

        Transport.showTimings();
        Transport.calculateFare(20);

    }
}