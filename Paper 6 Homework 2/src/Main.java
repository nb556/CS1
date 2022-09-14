import java.util.Objects;

import static ibio.Helpers.*;

public class Main
{

    public static void main(String[] args)
    {
        boolean RUNNING = true;
        while (RUNNING)
        {
            String OPERATION = inputString ("give operation: ");
            if (Objects.equals(OPERATION, "end"))
            {
                RUNNING = false;
            }
            else
            {
                int A = inputInt("give first integer operand: ");
                int B = inputInt("give second integer operand ");

                if (Objects.equals(OPERATION, "add"))
                {
                    output(A+B);
                }
                else if (Objects.equals(OPERATION, "sub"))
                    output(A-B);
                else
                    output("unknown operation");
            }
        }
    }
}