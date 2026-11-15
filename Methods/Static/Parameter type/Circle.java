class Circle{
	public static void Area(double pi, int r){
		double aoc = pi*r*r;
		System.out.println("The area of circle is :" +aoc);
	}
	public static void main(String [] args) {
		Area(3.142,5);
	}
}