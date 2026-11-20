//WAP to perfrom the mathematical opertaion using non-static methods b/w the class in  all 3 mode


class Addition{
	public void Add(){
		int a = 65;
		int b = 29;
		int c = a+b;
		System.out.println("a+b="+c);
	}
}
class Multiplication{
	public void Multiply(int a , double b ){
		double c = a*b;
		System.out.println("a*b="+c);
	}
}
class Substraction{
	public int Sub(){
		int x = 45;
		int y = 86;
		int z =x-y;
		return z;
	}
} 
class Division{
	public double Div(double a, int b){
		double c = a/b;
		return c;
	}
}
class Calculator{
	public static void main(String[]args){
		new Addition().Add();
		System.out.println("x-y =" +new Substraction().Sub());
		new Multiplication().Multiply(87,92.5);
		System.out.println("a/b = "+new Division().Div(27.5,68));
	}
}
