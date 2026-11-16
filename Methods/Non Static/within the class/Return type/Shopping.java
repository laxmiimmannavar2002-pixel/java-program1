//WAP to calculate the total amount for the 2 product purchase using a return type in the non-static context within the class

class Shopping{
	public double Bill(double prod1, double prod2){
		double total =(prod1+(prod1*0.12))+(prod2+(prod2*0.12));
		return total;
	}
	public static void main(String [] args){
		System.out.println(new Shopping().Bill(789.3,2027.0));
		System.out.println(new Shopping().Bill(63782.1,5433.8));
	}
}