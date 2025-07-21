//Task 7
public class Cart {
    public int count=0;
    public int capacity=3;
    public int cart_no;
    public double sum=0;
    public double discount=0;
    public String[] item_name = new String [capacity];
    public double[] price = new double [capacity];
    public void create_cart(int n)
    {
        cart_no=n;
    }
    public void addItem(String str,double x)
    {
        if(count<capacity)
        {
            item_name[count]=str;
            price[count]=x;
            count++;
            sum+=x;
            System.out.println(str + " added to cart " + cart_no + ".");
            System.out.println("You have " + count + " item(s) in your cart now.");
        }
        else
        {
            System.out.println("You already have 3 item(s) in your cart now.");
        }
    }
    public void addItem(double x,String str)
    {
        if(count<capacity)
        {
            item_name[count]=str;
            price[count]=x;
            count++;
            sum+=x;
            System.out.println(str + " added to cart " + cart_no + ".");
            System.out.println("You have " + count + " item(s) in your cart now.");
        }
        else
        {
            System.out.println("You already have 3 item(s) in your cart now.");
        }
    }
    public void giveDiscount(double n)
    {
        discount=n;
    }
    public void cartDetails(){
        System.out.println("Your cart(c"+cart_no+") :");
        for (int i = 0; i < count; i++) {
            System.out.println(item_name[i]+" - "+price[i]);
        }
        System.out.println("Discount Applied: "+discount+"%" );
        System.out.println("Total price: "+(sum-(sum*(discount/100))));
    }
}
