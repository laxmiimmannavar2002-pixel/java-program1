class Multiply {
	public void Multi(int x,int y){
		int prod = x*y;
		System.out.println("Product of 2 numbers is:"+prod);
	}
	public static void main(String[] args){
		new Multiply().Multi(10,5);
		new Multiply().Multi(27,86);
		new Multiply().Multi(9,4);
	}
}