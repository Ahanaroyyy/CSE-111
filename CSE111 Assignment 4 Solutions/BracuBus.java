//Task 7
public class BracuBus {
    public int max=2;
    public String route;
    public String passengers="";
    public int count=0;
    public BracuBus(String a,int b)
    {
        route=a;
        max=b;
    }
    public BracuBus(String a)
    {
        route=a;
    }
    public void showDetails()
    {
        System.out.println("Bus Route: "+route);
        System.out.println("Passenger Count: "+count+" (Max: "+max+")");
        System.out.println("Passengers on Board: ");
        if(count!=0){
        System.out.print(passengers);}
    }
    public void board()
    {
        if(count==0)
        {
            System.out.println("No passengers");
        }
    }
    public void board(BracuStudent a, BracuStudent b)
    {
     board(a);
     board(b);
    }
    public void board(BracuStudent a) {

        if (a.bus_pass == false) {
            System.out.println("You don't have a bus pass!");
        }
        else if (!(a.location.equals(this.route)))
        {
            System.out.println("You got on the wrong bus!");
        }
        else
        {
            if(count==max)
            {
                System.out.println("Bus is full!");
            }
            else {
                System.out.println(a.name + " boarded the bus.");
                count++;
                passengers+=a.name+" ";
            }
        }
    }
}
