//ref variable

class Demo{
	int a = 76;
	String s = "Hello";
	public void Display(){
		System.out.println("Hii");
	}
	public static void main(String[]args){
		Demo x = new Demo();   //reference variable
		x.Display();
		System.out.println(x.a);
		System.out.println(x.s);
	}
}