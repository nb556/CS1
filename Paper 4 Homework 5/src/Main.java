public class Main
{
    public static void main(String[] args)
    {
        int[] original = {-3, 2, 6, -11};
        int sum = original[0];

        System.out.println(original[0]);

        for (int i = 1; i < original.length; i++)
        {
            sum = sum + original[i];
            System.out.println(sum);
        }
    }
}