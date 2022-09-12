public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {1, 3, 3, 5};
        sumUpTo(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    static int[] sumUpTo (int[] n)
    {
        int sum = n[0];
        n[1] += sum;
        for (int i = 1; i < n.length; i++)
        {
            n[i] += n[i-1];
        }
        return n;
    }
}