public class Main
{
    public static void main(String[] args)
    {

    }

    static int[] concatenate (int[] a , int[] b)
    {
     int[] c = new int [a.length + b.length];
     for (int i : a)
         c [i] = i;

     for (int i : b)
         c [i] = i;

     return c;
    }
}