// Task 8
public class Employee {
    String name;
    double salary=30000.00;
    String designation = "junior";
    public void newEmployee(String n){
        name=n;
    }
    public void displayInfo()
    {
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary+" Tk");
        System.out.println("Employee Designation: "+designation);
    }
    public void promoteEmployee(String n)
    {
        designation=n;
        System.out.println(name+" has been promoted to "+designation);
        if(designation.equals("senior"))
        {
            salary+=25000;
        }
        else if(designation.equals("lead"))
        {
            salary+=50000;
        }
        else if(designation.equals("manager"))
        {
            salary+=75000;
        }
        System.out.println("New Salary: "+salary+" Tk");
    }
    public void calculateTax()
    {
        if(salary>50000)
        {
            System.out.println(name+" Tax Amount: "+(.3*salary)+"Tk");
        }
        else if(salary>30000)
        {
            System.out.println(name+" Tax Amount: "+(.1*salary)+"Tk");
        }
        else
        {
            System.out.println("No need to pay tax");
        }
    }
}
