  class Calculator {

    public void addition(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void subtraction(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    public void multiplication(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public void division(int a, int b) {
        System.out.println("Division: " + (a / b));
    }

    public static void main(String[] args) {
       new Calculator().addition(10,60);
	   new Calculator().subtraction(40,50);
	   new Calculator().multiplication(60,70);
	   new Calculator().division(6,7);
    }
}