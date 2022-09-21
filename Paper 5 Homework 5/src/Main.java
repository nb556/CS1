public class Main
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 3, 3, 6, 7, 8, 9, 10};
        int[] b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int X = 3;

        REMOVE(a, X, b);

        for (int i : b)
        {
            System.out.println(i);
        }
    }

    static int[] REMOVE(int[] IN, int X, int[] OUT)
    {


        for (int i = 0, j = 0; i < IN.length; i++)
        {
            if (IN[i] != X)
            {
                OUT[j] = IN[i];
                j++;
            }
        }

        return OUT;
    }
}
