public class Main {
    public static void main(String[] args)
    {
        boolean RESULT = true;
        int VALUES[] = {-3, 2, 5, 4, 7};


        for (int N = 1; RESULT==true && N < 5; N++)
        {
            if (VALUES[N] < VALUES[N-1])
                RESULT = false;
        }

        System.out.println(RESULT);
    }
}

/*
1. After running the loop thrice, the loop ends with N having the value of 3.
The program outputs "false".

2. The purpose of the program is to check if the first five values of the sequence of numbers is ascending.
 */