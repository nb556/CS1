public class Main
{
    public static void main(String[] args)
    {
        int homework = 3;

        if(homework == 2)
        {
            int A = 4;
            int B = 4;
            int AB = A + B;

            if (A == B)
                System.out.println(AB * AB);
            else
                System.out.println(A + B);
        }
        else if (homework == 3)
        {
            int n = 10;
            int x = 998;
            int y = 0;

            while(n < 37){
            n += 3;}
            System.out.println(n);

            while(x > 900){
                x -= 1;
            }
            System.out.println(x);

            while(y < 20){

                y += 1;
            }

        }
        else
            System.out.println("Please select a valid Homework value");
    }
}