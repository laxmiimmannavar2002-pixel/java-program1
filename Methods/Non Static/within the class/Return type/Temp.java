//Create a class Temperature and define a method that returns the temperature converted from Celsius to Fahrenheit.
// f= (c*1.8)+32


class Temp{
    public double Convert(double c) {
        double f = (c*1.8)+32;
		return f;
    }
    public static void main(String[] args) {
        System.out.println(new Temp().Convert(94.0)+"F");
		System.out.println(new Temp().Convert(57.8)+"F");
		System.out.println(new Temp().Convert(102.3)+"F");
    }
}