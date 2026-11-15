class HemiSphere {
	public void Vol(double pi, int r){
		double voh = 0.66*pi*r*r*r;
		System.out.println("Volume of hemesphere is:" +voh);
	}
	public static void main(String[] args){
		new HemiSphere().Vol(3.142,3);
		new HemiSphere().Vol(3.142,5);
		new HemiSphere().Vol(3.142,7);
		new HemiSphere().Vol(3.142,6);
	}
}