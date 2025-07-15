//Task5
public class TaxiLagbe {
    public int passsenger_no = 0;
    public String list = "";
    public int fare = 0;
    public String taxi_number;
    public String location;
    int capacity=4;

    public void storeInfo(String str1, String str2) {
        taxi_number = str1;
        location = str2;
    }

    public void printDetails() {
        System.out.println("Taxi number: " + taxi_number);
        System.out.println("This taxi can cover " + location + " area");
        System.out.println("Total Passenger: " + passsenger_no);
        if(list.equals("")){
        System.out.println("Passengers Lists: " + list);}
        else
        {
            System.out.println("Passengers Lists: \n" + list);
        }
        System.out.println("Total collected fare: " + fare + " Taka");
    }

    public void addPassenger(String str, int n) {
        passsenger_no++;
        if (capacity >= passsenger_no) {
            fare += n;
            list += str+" ";
            System.out.println("Dear " + str + "! Welcome to TaxiLagbe");
        } else {
            passsenger_no--;
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }

    public void addPassenger(String str1, int n1, String str2, int n2) {

        for (int i = 0; i < 2; i++) {
            if (capacity >= passsenger_no && i == 0)
            {
                passsenger_no++;
                fare += n1;
                list += str1 + " ";
                System.out.println("Dear " + str1 + "! Welcome to TaxiLagbe");
            }
            else if (capacity >= passsenger_no)
            {
                passsenger_no++;
                fare += n2;
                list += str2 + " ";
                System.out.println("Dear " + str2 + "! Welcome to TaxiLagbe");
            }

            else
            {
                System.out.println("Taxi Full! No more passengers can be added");
                passsenger_no=4;
                break;
            }
        }
    }
}
