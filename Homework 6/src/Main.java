public class Main
{
    public static void main(String[] args)
    {
        int w = 11;
        int p;

        if (w > 5)
        {
            p = (w-5)*3 +9;
        }
        else if (w > 2)
        {
            p = (w-2)*2 + 3;
        }
        else
        {
            p = 3;
        }


        System.out.println(p);
    }
}