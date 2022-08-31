public class Main
{
    public static void main(String[] args)
    {
        double[] numbers = {8.9, 5.6, 4.2, 7.7, 2};

        double smallest = numbers[0];

        for (double n : numbers)
            if (n < smallest)
                smallest = n;

        System.out.println(smallest);
    }
}