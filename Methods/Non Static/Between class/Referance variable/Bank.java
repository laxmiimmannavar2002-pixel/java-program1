//access a non-static member b/w the class using ref variable
class User_1{
	public void Withdraw(){
		int bal = 108723;
		int draw = 5637;
		System.out.println(bal-draw);
	}
}
class User_2{
	public void Deposite(int dep){
		int bal = 10000;
		System.out.println(bal+dep);
	}
}
class User_3{
	public double Loan(int p,int t,double r){
		double l= (p*t*r)/100;
		return l;
	}
}
class Bank{
	public static void main(String[]args){
		User_1 u1=new User_1();
		User_2 u2=new User_2();
		User_3 u3=new User_3();
		u1.Withdraw();
	    u2.Deposite(65839);
	    System.out.println(u3.Loan(100000,5,7.8));
	}
}