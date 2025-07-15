////public class CinemexTicket extends MovieTicket{
////    public int index=0;
////    public String genre;
////    public String status="Not Paid";
////    public String id;
////    private static int count=0;
////    public CinemexTicket(String a,String b,String c,String d)
////    {
////
////        super(a,d,b,0);
////        count++;
////        seat="Regular";
////        for (int i = 0; i < seatTypes.length; i++) {
////            if(seatTypes[i].equals(seat))
////            {
////                index=i;
////                break;
////            }
////        }
////        genre=c;
////        generateId();
////    }
////    public CinemexTicket(String a,String b,String c,String d,String e)
////    {
////
////        super(a,d,b,0);
////        count++;
////        seat=e;
////        for (int i = 0; i < seatTypes.length; i++) {
////            if(seatTypes[i].equals(seat))
////            {
////                index=i;
////                break;
////            }
////        }
////        genre=c;
////        generateId();
////    }
////    public static int getTotalTickets()
////    {
////        return count;
////    }
////    public void generateId()
////    {
////        id=getMovie()+"-"+seat.charAt(0)+"-"+count;
////    }
////    public String toString()
////    {
////        return "Ticket ID: "+id+"\n"+super.toString()+"\nGenre: "+genre+"\nSeat Type: "+seat+"\nPrice(tk): "+getPrice()+"\nStatus: "+status;
////    }
////public void calculateTicketPrice()
////{
////    String [] arr = showtime.split(":");
////    int abc = Integer.parseInt(arr[0]);
////    if(abc>=18 && abc<=23)
////    {
////        setPrice(seatPrices[index]+0.15*seatPrices[index]);
////    }
////    else
////    {
////        setPrice(seatPrices[index]);
////    }
////    System.out.println("Ticket price is calculated successfully.");
////}
////    public String confirmPayment()
////    {
////        if(status.equals("Paid"))
////        {
////            return "Ticket price is already paid!";
////        }
////        else {
////            status="Paid";
////            return "Payment Successful";
////        }
////    }
////
////}
//public class CinemexTicket extends MovieTicket{
//   public static int total;
//    public static String [] seatTypes = {"Regular", "Premium", "IMAX 3D"};
//    public static double [] seatPrices = {300.0, 450.0, 600.0};
//    public static int nightShowCharge = 15;
//    private String movie;
//    public String showtime;
//    public String date;
//    private double price;
//    public String seat;
//    private String genre;
//    private String status="Not Paid";
//    private String id;
//    private boolean flag;
//    public CinemexTicket(String a, String b, String c, String d )
//    {
//        super(a,b,c,345.0);
//        movie=a;
//        showtime=b;
//        genre=c;
//        date=d;
//        seat="Regular";
//        total++;
//        id=movie+"-"+seat.charAt(0)+"-"+getTotalTickets();
//
//
//    }
//    public CinemexTicket(String a, String b, String c, String d, String e )
//    {
//        super(a,b,c,345.0);
//        movie=a;
//        showtime=b;
//        genre=c;
//        date=d;
//        seat=e;
//        total++;
//        id=movie+"-"+seat.charAt(0)+"-"+getTotalTickets();
//
//    }
//
//    public static int getTotalTickets()
//    {
//
//        return total;
//    }
//    public void calculateTicketPrice()
//    {
//        for (int i = 0; i < seatTypes.length; i++) {
//            if(seat.equals(seatTypes[i]))
//            {
//                price=seatPrices[i];
//                break;
//            }
//        }
//        String [] parts = showtime.split(":");
//        int hour = Integer.parseInt(parts[0]);
//        int minute = Integer.parseInt(parts[1]);
//        if(hour>=18 && hour<=23)
//        {
//            if(hour==23)
//            {
//                if(minute==0){price=price+(0.15*price);}
//            }
//            else
//            {
//                price=price+(0.15*price);
//            }
//        }
//        System.out.println("Ticket price is calculated successfully.");
//        setPrice(price);
//    }
//    public String toString() {
//        return "Ticket ID: "+id+"\nMovie: " + movie + "\nShowtime: " + showtime + "\nDate: " + date+"\nGenre: "+genre+"\nSeat Type: "+seat+"\nPrice(tk): "+price+"\nStatus: "+status;
//    }
//public String confirmPayment() {
//    if (!flag)
//    {
//    flag=true;
//    status="Paid";
//    return "Payment Successful";}
//    else
//    {
//        return "Ticket price is already paid!";
//    }
//}
//}

public class CinemexTicket extends MovieTicket{
   public static int total;
   public String genre;
   public String id;
    public CinemexTicket(String movieName,String time, String genre, String date)
    {
        super(movieName,date,time,300.0);
        seat="Regular";
        this.genre=genre;
        total++;
         id = getMovie() + "-" + seat.charAt(0) +"-"+ getTotalTickets();
    }
    public CinemexTicket(String movieName,String time, String genre, String date,String seatType)
    {
        super(movieName,date,time,0.0);
        this.genre=genre;
        for (int i = 0; i < seatTypes.length; i++) {
            if(seatTypes[i].equals(seatType))
            {
                setPrice(seatPrices[i]);
            }
        }
        seat=seatType;
        total++;
         id = getMovie() + "-" + seat.charAt(0) +"-"+ getTotalTickets();
    }
    public static int getTotalTickets()
    {
        return total;
    }
    public void calculateTicketPrice()
    {
        String[] Time = showtime.split(":");
        int time1 = Integer.parseInt(Time[0]);
        int time2 = Integer.parseInt(Time[1]);
        if(time1>=18 && time1<=23)
        {
            if(time1==23)
            {
                if(time2>=0)
                {

                }
            }
            setPrice(getPrice()+getPrice()*0.15);
        }
        System.out.println("Ticket price is calculated successfully");
    }

    String status = "Not Paid";
    public String confirmPayment()
    {
        if(status.equals("Paid"))
        {
            return"Ticket price is already paid!";
        }
        else
        {
            status = "Paid";
            return "Payment Successful.";
            }
    }
public String toString()
{
return "Ticket ID: "+id+"\n"+super.toString()+"\nGenre:"+genre+"\nSeat Type:"+seat+"\nPrice(tk): "+getPrice()+"\nStatus:"+status;
}
}
