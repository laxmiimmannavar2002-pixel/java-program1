//user defined constructor


class Student{
	String s_name;
	int s_marks;
	int s_age;
	public Student(String name,int marks,int age){
		s_name = name;
		s_marks = marks;
		s_age = age;
	}
	public static void main(String[]args){
		Student s = new Student("Soni",97,23);
		System.out.println(s.s_name);
		System.out.println(s.s_marks);
		System.out.println(s.s_age);
	}
}