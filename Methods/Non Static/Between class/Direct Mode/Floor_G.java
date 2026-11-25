 //WAP to access the non-static members b/w the class using a direct mode

class Floor_1 {
	public void Display1(){
		System.out.println("Room-101");
	}
	public void Display2(){
		System.out.println("Room-201");
	}}
class Floor_2{
	public void Display1(){
		System.out.println("Room-101");
	}}
class Floor_G{
	public static void main(String [] args){
		new Floor_1().Display1();
		new Floor_1().Display2();
		new Floor_2().Display1();
	}
}