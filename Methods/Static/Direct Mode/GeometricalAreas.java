public class GeometricalAreas {

    // 1. Rectangle

    static double rectangle(double length, double breadth) {

        return length * breadth;

    }

    // 2. Square

    static double square(double side) {

        return side * side;

    }

    // 3. Triangle

    static double triangle(double base, double height) {

        return 0.5 * base * height;

    }

    // 4. Ellipse

    static double ellipse(double a, double b) {

        return Math.PI * a * b;

    }

    // 5. Trapezoid

    static double trapezoid(double a, double b, double height) {

        return 0.5 * (a + b) * height;

    }

    // 6. Parallelogram

    static double parallelogram(double base, double height) {

        return base * height;

    }

    // 7. Circle

    static double circle(double radius) {

        return Math.PI * radius * radius;

    }

    public static void main(String[] args) {

        System.out.println("Area of Rectangle: "

                + rectangle(10, 5));

        System.out.println("Area of Square: "

                + square(5));

        System.out.println("Area of Triangle: "

                + triangle(10, 6));

        System.out.println("Area of Ellipse: "

                + ellipse(5, 3));

        System.out.println("Area of Trapezoid: "

                + trapezoid(6, 4, 5));

        System.out.println("Area of Parallelogram: "

                + parallelogram(8, 5));

        System.out.println("Area of Circle: "

                + circle(7));

    }

}