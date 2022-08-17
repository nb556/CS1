public class Main
{
    public static void main(String[] args)
    {
        int grade;
        int marks = 90;

        if (marks >= 90)
            grade = 10;
        else if (marks >= 70)
            grade = 9;
        else
            grade = 8;

        System.out.println("The grade is " + grade);

    }
}