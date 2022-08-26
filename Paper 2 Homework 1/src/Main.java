public class Main
{
    public static void main(String[] args)
    {
        int A = 2;
        int B = 3;
        int C = 1;
        int RESULT = A;

        if (B > RESULT)
            RESULT = B;

        if (C > RESULT)
            RESULT = C;

        System.out.println(RESULT);

        // The program finds the largest integer out of the three
    }
}