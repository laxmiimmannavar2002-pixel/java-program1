//If-else Statements


class Online{
	public static void main(String[]args){
		int orderAmount = 1800;
		if(orderAmount>=1000){    //1800>=1000
			System.out.println("Order placed");
			System.out.println("Free Delivery");
		}else{
			System.out.println("Order placed");
			System.out.println("Delivery charge: Rs 50");
		}
	}
}