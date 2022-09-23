public class Main
{
    public static void main(String[] args)
    {
        Product[] products = new Product[2];
        products[0] = new Product(1, 5.6);
        products[1] = new Product(2, 1.9);
        for (Product p : products)
            p.print ();

        Product p1 = new Product(3, 15.6);
        p1.print();
    }
}

class Product
{
    Product (int id, double price)
    {
        this.id = id;
        this.price = price;
    }

    void print ()
    {
        System.out.println("id: " + id + ", price: " + price);
    }

    int id;
    double price;
}