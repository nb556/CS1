public class Main
{
    public static void main(String[] args)
    {
        int t = 0;
        int bact1;
        int bact2 = 0;
        int highest = 0;
        int highestt = 0;


        while ( t < 100)
        {

            bact1 = t*(t-20)*(t-100)+120000;

            if (bact1 - bact2 > highest) {
                highest = bact2 - bact1;
                highestt = t;
            }

            t++;

            bact2 = (t+1)*((t+1)-20)*((t+1)-100)+120000;

        }

        System.out.println(highestt+1);
    }
}