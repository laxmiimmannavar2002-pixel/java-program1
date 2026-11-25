class Employee{
	String emp_name;
	int emp_id;
	double emp_sal;
	Employee(){
		System.out.println("Before initialization");
		System.out.println(emp_name);
		System.out.println(emp_id);
		System.out.println(emp_sal);
		
		emp_id = 1342;
		emp_name = "Soni";
		emp_sal = 24522.6 ;
	}
	public static void main(String[]args){
		Employee e = new Employee();
		System.out.println("After initialization");
		System.out.println(e.emp_name);
		System.out.println(e.emp_id);
		System.out.println(e.emp_sal);
	}
}