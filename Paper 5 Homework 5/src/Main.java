public class Main
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 3, 3, 6, 7, 8, 9, 10};
        int[] b = {6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
        int X = 3;

        REMOVE(a, X, b);

        for (int i : b)
        {
            System.out.println(i);
        }
    }

    static int[] REMOVE(int[] IN, int X, int[] OUT)
    {
        int j = 0;

        for (int i : IN)
        {
            if (i != X)
            {
                OUT[j] = i;
                j++;
            }
        }
        while (j < OUT.length)
        {
            OUT[j] = 0;
            j++;
        }

        return OUT;
    }
}
