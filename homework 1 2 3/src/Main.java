public class Main
{
    public static void main(String[] args)
    {
        int homework = 3;

        if (homework == 1)
        {
            System.out.println("Examples of fundamental computer operations would be ADD and STORE. Examples of compound computer operations would be finding the largest or the smallest number.");
            System.out.println("Essential features of a computer language would be for example it's simplicity, naturalness to users and it's efficiency");
            System.out.println("The function of a compiler is to convert conventional code into Assembly, which is the language a computer would understand.");
            System.out.println("Using constants can simplify the maintenance of the code and provide a usable version of a number like pi.");
        }
        else if(homework == 2)
        {
            int A = 4;
            int B = 4;

            if (A == B)
                System.out.println((A+B) * (A+B));
            else
                System.out.println(A + B);
        }
        else if (homework == 3)
        {
            int n = 10;
            int x = 998;
            int y = 0;
            int z = 1;

            while(n < 37){
                n += 3;
                System.out.println(n);
            }


            while(x > 900){
                x -= 1;
                System.out.println(x);
            }


            while(y < 20){
                y += 1;
                System.out.println(y);
            }

            while(z <= 60)
            {
                if(z % 3 == 0)
                {
                    System.out.println(9);
                }
                else
                {
                    System.out.println(7);
                }
                z += 1;
            }

        }
        else
            System.out.println("Please select a valid Homework value");
    }
}