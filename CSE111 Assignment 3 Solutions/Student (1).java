// Task 6
public class Student {
    public String name = "Not Set";
    public String department = "CSE";
    public double CGPA = 0.0;
    public int credits=9;
    public String scholarship= "Not Set";

    public void updateDetails(String str, double CGPA, int credits)
    {
        this.name=str;
        this.CGPA=CGPA;
        this.credits=credits;
    }
    public void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
        System.out.println("CGPA: "+CGPA);
        System.out.println("Credits: "+credits);
        System.out.println("Scholarship Status: "+scholarship);
    }
    public void checkScholarshipEligibility(){
        if(CGPA>=3.5 && credits>10)
        {
            if(CGPA>=3.5 && CGPA<3.7)
            {
                scholarship="Need based scholarship";
                System.out.println(name+" is eligible for "+scholarship);
            }
            else
            {
                scholarship="Merit based scholarship";
                System.out.println(name+" is eligible for "+scholarship);
            }
        }
        else
        {
            System.out.println(name+" is not eligible for "+scholarship);
            scholarship="No scholarship";
        }
    }
    public void updateDetails(String str, double CGPA)
    {
        this.name=str;
        this.CGPA=CGPA;
    }
    public void updateDetails(String str, double CGPA, int credits, String department_name)
    {
        this.name=str;
        this.CGPA=CGPA;
        this.credits=credits;
        this.department= department_name;
    }
}