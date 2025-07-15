//Task 7
public class CellPhone {
    public String model = "unknown";
    public int contact_count=0;
    public String contact_names="";
    public void storeContact(String n){
        contact_count++;
        if(contact_count>3)
        {
            System.out.println("Memory full. New contact can't be stored.");
            contact_count--;
        }
        else {
            System.out.println("Contact Stored");
            contact_names+="\n"+n;
        }
    }
    public void printDetails()
    {
        System.out.println("Phone Model "+model);
        System.out.println("Contacts Stored "+contact_count);
        if(contact_count>0)
        {
            System.out.println("Stored Contacts: "+contact_names);
        }
    }
}
