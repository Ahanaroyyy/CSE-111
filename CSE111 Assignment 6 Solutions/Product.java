// Task 8
public class Product {
    private String name="Unknown";
    private double price;
    private int quantity;
    public Product(){}
    public Product(String a,double b)
    {
        name=a;
        price=b;
    }
    public void displayInfo()
    {
        System.out.println("Product Name: "+name);
        System.out.print("Price: $"+price);

    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public void setQuantity(int a)
    {
        quantity= a;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void displayInfo(boolean a)
    {
        System.out.println("Product Name: "+name);
        System.out.println("Price: $"+price);
        System.out.println("Quantity: "+quantity);
    }

}
