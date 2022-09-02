public class Main
{
    public static void main(String[] args)
    {
        double smallest = 10000;
        double[] elements = {2, 5, -3, 11, 193, -2};

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < smallest)
                smallest = elements[i];
        }

        System.out.println(smallest);
    }
}