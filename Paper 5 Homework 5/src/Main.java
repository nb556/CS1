public class Main
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {7, 7, 7, 7, 7, 7};
        int X = 3;

        for (int i = 0; i < b.length; i++)
        {
            System.out.println(REMOVE(a, X, b)[i]);
        }
    }

    static int[] REMOVE(int[] IN, int X, int[] OUT)
    {
        IN = new int[10];
        OUT = new int[10];

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
