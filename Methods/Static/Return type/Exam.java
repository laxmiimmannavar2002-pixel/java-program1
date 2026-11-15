class Exam
{
    public static String result(long reg_num)
    {
        String p = "Pass";
        String f = "Fail";

        System.out.println("Student reg no: " + reg_num);

        return p;
    }

    public static void main(String[] args)
    {
        System.out.println(result(33264966588l));
    }
}