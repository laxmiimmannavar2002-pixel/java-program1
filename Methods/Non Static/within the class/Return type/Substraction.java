// WAP to substract 2 num using a return type within the class in the non -static context

class Substraction {
	public int Sub(){
		int a = 55;
		int b = 20;
		int c = a-b;
		return c;
	}
	public static void main(String [] args){
		int x = new Substraction().Sub();
		System.out.println(x);
	}
}