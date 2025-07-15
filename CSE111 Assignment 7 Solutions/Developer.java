// Task 6
public class Developer extends Employee{
    private String lang;
    private double finalSalary;
    public Developer(String a,double b,int c,String d)
    {
        super(a,b,c);
        lang=d;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + getBaseSalary());
        System.out.println("Work Hours: " + getHoursWorked());
        System.out.println("Language: "+lang);
        System.out.println("Final Salary: $"+finalSalary);
    }
    public void calculateSalary()
    {
        if(lang.equals("Java"))
        {
            finalSalary=getBaseSalary()+700;
        }
        else
        {
            finalSalary=getBaseSalary();
        }
    }
}
