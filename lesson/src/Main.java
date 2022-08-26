public class Main
{
    public static void main(String[] args)
    {
        boolean leap;
        int year = 0;

        while (year <= 2100){
            if ((year % 4) == 0 && ( !(year % 100 == 0) || (year % 400 == 0))) {
                System.out.println(year);
            }

            year++;
        }

    }
}