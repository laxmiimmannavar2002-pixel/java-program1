class Non_Static {

    int a = 5;   // non-static member

    public void Demo() {
        System.out.println("Hi, im a non-static member");
    }

    public static void main(String[] args) {

        // create the object using the syntax
        // new classname();

        new Non_Static().Demo();

        System.out.println(new Non_Static().a);
    }
}