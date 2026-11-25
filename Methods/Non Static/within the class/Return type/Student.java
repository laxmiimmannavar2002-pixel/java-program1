  public class Student {

    int calculateTotal(int mark1, int mark2, int mark3) {
        return mark1 + mark2 + mark3;
    }

    public static void main(String[] args) {
        Student s = new Student();

        int total = s.calculateTotal(80, 90, 85);

        System.out.println("Total Marks: " + total);
    }
}