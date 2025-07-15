// Task 7
public class BracuStudent {
    public String location="";
    public String name="";
    boolean bus_pass =false;
    public BracuStudent(String a,String b)
    {
        name=a;
        location=b;
    }
    public void showDetails()
    {
        System.out.println("Student Name: "+name);
        System.out.println("Lives in "+location);
        System.out.println("Have Bus Pass? "+bus_pass);
    }
    public void getPass()
    {
        bus_pass=true;
    }
    public void updateHome(String a)
    {
        location=a;
    }
}
