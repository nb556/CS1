public class Main
{
    public static void main(String[] args)
    {
        double alpha;

        for (int i = 0; i < 10; i++)
        {
            alpha = i*(Math.PI/5);

            System.out.println(alpha);

            System.out.println(Math.sin(alpha));

            System.out.println(Math.cos(alpha));
        }
    }
}