public class Main
{
    public static void main(String[] args)
    {
        int program = 2;
        if (program == 1)
        {
            int a = 5;
            int result = 1;

            for (int i = 1; i <= a; i++)
                result *= 3;
            System.out.println(result);
        }
        else if (program == 2)
        {
            int a = 2, b = 5;
            int result = 1;

            for (int i = 1; i <= a; i++)
                result *= b;
            System.out.println(result);
        }
    }
}