public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        int integer = 5;
        System.out.println(contains(arr, integer));

    }

    static boolean contains (int[] array, int value)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == value)
                return true;
        }
        return false;
    }
}