public class Main {
    public static void main(String[] args)
    {
        boolean found = false;
        int n = 1000000;
        int smallest = 0;

        while (!found)
        {
            while(n > 0)
            {
                if ((n * n * n + 91) % 47 == 0)
                {
                    smallest = n;
                }

                n -= 1;
            }
            found = true;
        }

        System.out.println (smallest);

    }
}