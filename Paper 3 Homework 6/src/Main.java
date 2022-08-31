public class Main
{
    public static void main(String[] args)
    {
        int x = 12  ;
        boolean prime = true;

        if (x > 1)
            for (int i = 2; i <x; i++){
                if (x % i == 0)
                    prime = false;
            }
        System.out.println(prime);
    }
}