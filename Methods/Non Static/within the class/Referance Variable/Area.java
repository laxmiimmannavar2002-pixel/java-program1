//Using a ref variable access the non-static methods with in the class

class Area {
	double pi = 3.142;
	public void Square(){
		int s = 65;
		int aos = s*s;
		System.out.println("Area of a square is:"+aos);
	}
	public void Triangle(double a,int b){
		double aot = 0.5*a*b;
		System.out.println("Area of triangle is:"+aot);
	}
	public double Circle(){
		int r = 6;
		double aoc = pi*r*r;
		return aoc;
	}
	public double Ellipse(int a,int b){
		double aoe = pi*a*b;
		return aoe;
	}
	public static void main(String[]args){
		Area obj = new Area();  
	//homogeneous type of creating a object
	//classtype ref_var= new classname();
	obj.Square();
	obj.Triangle(5.9, 5);
	System.out.println("Area of circle is:"+obj.Circle());
	System.out.println("Area of ellipse is:"+obj.Ellipse(8,6));
	}
}