class Student {

    public void displayDetails(String name, int age, String branch) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
    }

    public static void main(String[] args) {
        new Student().displayDetails("Soni",23,"MCA");
    }
}