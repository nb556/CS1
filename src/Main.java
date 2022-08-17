public class Main
{
    public static void main(String[] args)
    {
       int n = 10;
       int factorial = 1;
       int factor = 1;

       while(factor <= n)
       {
           factorial *= factor;
           factor++;
       }

       System.out.println(factorial);

    }
}