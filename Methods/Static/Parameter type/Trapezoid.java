class Trapezoid {
    public static void area(double a, double b, double h) {
        double aot = 0.5 * (a + b) * h;
        System.out.println("Area of Trapezoid: " + aot);
    }

    public static void main(String[] args) {
        area(4, 8, 5);
    }
}