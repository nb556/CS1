public class Main
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = reverse(a);

        for (int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }
    }

    static int[] reverse (int[] a)
    {
        int[] x = new int[a.length];

        for (int i = 0; i < a.length; i++)
        {
            x[i] = a[a.length - 1 - i];
        }
        return x;
    }
}