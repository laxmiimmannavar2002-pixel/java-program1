class Triangle
{
    public static void Tri()
    {
        int b = 5;
        int h = 8;

        double area = 0.5 * b * h;

        System.out.println("Area of triangle is: " + area);
    }
}

class Square
{
    static int s = 10;

    public static void Squ()
    {
        int aos = s * s;

        System.out.println("Area of square is : " + aos);
    }

    public static void Vol()
    {
        int aov = s * s * s;

        System.out.println("Area of Voume is : " + aov);
    }
}

class Area
{
    public static void main(String[] args)
    {
        Square.Squ();
        Triangle.Tri();
        Square.Vol();
    }
}