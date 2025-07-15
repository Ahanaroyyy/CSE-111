// Task 2
//public class Passenger{
//    public static int no_of_passenger;
//    public static double total_fare;
//
//    private double distance;
//    private double baggage;
//    private String name;
//    private double fare;
//
//    public void setName(String a)
//    {
//        name=a;
//    }
//    public String getName()
//    {
//        return name;
//    }
//    public void setDistance(double a)
//    {
//        distance=a;
//    }
//    public double getDistance()
//    {
//        return distance;
//    }
//    public void storeBaggageWeight(double a)
//    {
//        baggage=a;
//        setFare();
//    }
//    public double returnBaggage()
//    {
//        return baggage;
//    }
//    public void setFare(double a)
//    {
//        fare=a;
//    }
//    public void setFare()
//    {
//        total_fare-=fare;
//        fare=(20*distance)+(10*baggage);
//        total_fare+=fare;
//    }
//    public double getFare()
//    {
//        return fare;
//    }
//    public Passenger(String a,double b)
//    {
//        name=a;
//        distance=b;
//        setFare();
//    }
//    public void passengerDetails()
//    {
//        System.out.println("Name: "+name);
//        System.out.println("Fare: "+ fare+" TK");
//    }
//}
public class Passenger {
    public static int no_of_passenger;
    public static double total_fare;
    private String name;
    private double fare;
    public Passenger(String a, double b)
    {
        name=a;
        fare=(b*20);
        no_of_passenger++;
        total_fare+=fare;
    }
    public void storeBaggageWeight(double a)
    {
        fare+=(a*10);
        total_fare+=(a*10);
    }
    public void passengerDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Fare: "+fare+" TK");
    }
}