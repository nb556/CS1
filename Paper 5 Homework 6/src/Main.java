public class Main
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < a.length; i++)
        {
            System.out.println(alternate(a)[i]);
        }
    }

    static int[] alternate (int[] a)
    {
        int[] alter = new int[a.length+1];

        for (int i = 0, j = 0; i < alter.length/2; i++)
        {
            alter[j] = a[i];
            j++;
            alter[j] = a[a.length-1-i];
            j++;
        }
        return alter;
    }
}