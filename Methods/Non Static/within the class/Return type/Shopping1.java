class Shopping1{
	public int calculateBill(int price,int quantity){
		int bill = price*quantity;
		return bill;
	}
	public static void main(String[]args){
		System.out.println(new Shopping1().calculateBill(100,5));
	}
}