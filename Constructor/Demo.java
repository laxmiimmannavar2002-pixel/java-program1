class Demo{
	char c;
	boolean b;
	public Demo(char c, boolean b){
		this.c = c;
		this.b = b;
	}
	public static void main(String[]args){
		Demo d = new Demo('s',true);
		System.out.println(d.c);
		System.out.println(d.b);
	}
}