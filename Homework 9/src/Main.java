public class Main
{
    public static void main(String[] args)
    {
        int t = 0;
        int bact1;
        int bact2 = 0;
        int highest = 0;
        int highestt = 0;


        while ( t <= 100)
        {

            bact1 = t*(t-20)*(t-100)+120000;

            if (bact2 - bact1 < highest) {
                highest = bact1 - bact2;
                highestt = t;
            }

            t++;



        }

        System.out.println(highestt+1);
    }
}