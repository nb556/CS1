public class Main
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = reverse(a);

        for (int i : b)
            System.out.println(i);
        

        int[] ba = {4, 3, 2, 1};
        int[] bb = {4, 3, 2, 1};

        System.out.print(equal(ba, bb));

        int[] ca = {1, 2, 1};
        int[] cb = reverse(ca);

        System.out.print(equal(ca, cb));
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

    static boolean equal (int[] a, int[] b)
    {
        if (a.length != b.length)
            return false;
        
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i])
                return false;

        return true;
    }


}
