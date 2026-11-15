class Sphere {
	final double pi = 3.142;
	public void Volume() {
		int r = 7;
		double vos = 1.33*pi*r*r*r;
		System.out.println("Volume of a sphere is:" +vos);
	}
	public static void main(String [] args) {
		new Sphere().Volume();
		System.out.println(new Sphere().pi);
	}
}