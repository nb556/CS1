public class Main
{
    public static void main(String[] args)
    {
        int[] a = {5, -16, 2, 11, 1};
        for (int v=0; v <= 3; v++)
        {
            swap(a, a[v], a[3]);
        }

        for (int i = 0; i< a.length-1; i++)
            System.out.println(a[i]);
    }

    static void swap (int[] array, int ind1, int ind2)
    {
        int tmp = array [ind2];
        array [ind2] = array [ind1];
        array [ind1] = tmp;

    }

}