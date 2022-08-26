public class Main
{
    public static void main(String[] args)
    {
        int X = 5, Y = -7, M, RESULT;

        if (Y < 0) {
            Y = -Y;
            M = -1;
        }
        else
            M = 1;

        System.out.println(M + Y);

        while (Y > 0){
            if (Y % 2 == 0){
                X += X;
                Y /= 2;
            }
            else {
                RESULT += X;
                Y -= 1;
            }
        }

        if (M < 0)
            RESULT = -RESULT;

    }
}