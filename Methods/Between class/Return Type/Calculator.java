class Addition {

    public static int Add() {

        int a = 23;
        int b = 88;
        int add = a + b;

        return add;
    }
}
class Substraction {

    public static int Sub(int a, int b) {

        int sub = a - b;

        return sub;
    }
}
class Multiplication {

    public static double Multi(double y) {

        int x = 75;
        double multi = x * y;

        return multi;
    }
}
class Division {

    public static double Div() {

        double div = 69 / 5.0;

        return div;
    }
}
class Calculator {

    public static void main(String[] args) {

        System.out.println("Addition: " + Addition.Add());

        System.out.println("Substraction: " + Substraction.Sub(34, 5));

        System.out.println("Multiplication: " + Multiplication.Multi(46.6));

        System.out.println("Division: " + Division.Div());

    }
}