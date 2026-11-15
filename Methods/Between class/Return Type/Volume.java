class Cone {

    public static void Vol(int r, int h) {

        final double pi = 3.142;

        // pi = 4; it is not possible as the variable is final

        double voc = 0.33 * pi * r * r * h;

        System.out.println("Volume of a Cone is: " + voc);
    }
}
class Volume {

    public static void main(String[] args) {

        Cone.Vol(3, 6);

    }
}