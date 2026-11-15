class Addition{
	public void Add(){
		int a = 76;
		int b = 34;
		double c = 64.2;
		double sum = a+b+c;
		System.out.println("Sum of 3 numbers is:" +sum);
	}
	public static void main(String [] args){
		new Addition().Add();
	}
}