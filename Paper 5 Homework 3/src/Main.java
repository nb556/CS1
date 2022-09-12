public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        int integer = 5;
        System.out.println(contains(arr, integer));

        int[] a = {5, 4, 6, 11};
        int[] b = {20, 21, 22};
        System.out.println(any(a, b));
    }

    static boolean contains (int[] array, int value)
    {
        for (int i : array)
        {
            if (i == value)
                return true;
        }
        return false;
    }

    static boolean any (int[] a, int[] b)
    {
        for (int i : a)
        {
            for (int x : b)
                if (x == i)
                    return true;
        }
        return false;
    }
}