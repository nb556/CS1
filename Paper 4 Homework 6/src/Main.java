public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {4, -3, -5, 9, 1, 11};
        int[] smaller = new int[0];
        int[] larger = new int[0];
        int m = 1;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < m)
                smaller[i] = arr[i];
            else if (arr[i] > m)
                larger[i] = arr[i];
        }
    }
}
