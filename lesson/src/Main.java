public class Main
{
    public static void main(String[] args)
    {
        int seq[] = {1,3,5,7,9};
        boolean arith = true;

        for (int i = 1; i < seq.length && arith; i++)
        {
            if (seq[i] - seq[i - 1] != seq[1] - seq [0])
                arith = false;
        }

        System.out.println(arith);
    }
}