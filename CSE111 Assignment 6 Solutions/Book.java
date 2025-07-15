//// Task 3
//public class Book {
//    public static int total_books_sold;
//    public static double total_revenue;
//
//    private double discount;
//    private double price;
//    private String name;
//
//    private void setName(String a)
//    {
//        name=a;
//    }
//    private String getName()
//    {
//        return name;
//    }
//    private void setPrice(double a)
//    {
//        price=(150-(150*0.01*a));
//    }
//    private double getPrice()
//    {
//        return price;
//    }
//    private void setDiscount(double a)
//    {
//        discount=a;
//    }
//    private double getDiscount()
//    {
//        return discount;
//    }
//
//    public Book(String a,double b)
//    {
//        name=a;
//        discount=b;
//        setPrice(discount);
//        total_books_sold++;
//        total_revenue+=getPrice();
//    }
//    public void bookDetails()
//    {
//        System.out.println("Title: "+name);
//        System.out.println("Price after Discount: "+price+" TK");
//    }
//}
public class Book {
    public static int total_books_sold;
    public static double total_revenue;
    private String name;
    private double price;
    private int discount;

    public void bookDetails()
    {
        System.out.println("Title: "+name);
        System.out.println("Price after Discount: "+price+" TK");
    }
    public Book(String a, int b)
    {
        price=getPrice(b);
        name=a;
        total_books_sold++;
        total_revenue+=price;
    }
    private double getPrice(int a)
    {
        return 150-(150*(double)(a*0.01));
    }


}
