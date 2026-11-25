//Constructor with 'this' keyword

class ThisEmployee{
	String emp_name;         //constructrior parameter
	int emp_id;
	double emp_sal;
	public ThisEmployee(String emp_name,int emp_id,double emp_sal){
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_sal = emp_sal;
	}
	public static void main(String[]args){
		ThisEmployee t = new ThisEmployee("Soni",345,24522.7);
		System.out.println(t.emp_id);
		System.out.println(t.emp_name);
		System.out.println(t.emp_sal);
	}
}