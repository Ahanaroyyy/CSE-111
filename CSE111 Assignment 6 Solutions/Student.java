//Task 7
public class Student {
    public static int cse_student;
    public static int others;
    public static int count=0;

    private int id;
    private String name;
    private double CGPA;
    public String department="CSE";

    public static void printDetails()
    {
        System.out.println("Total Student(s): "+count);
        System.out.println("CSE Student(s): "+cse_student);
        System.out.println("Other Department Student(s): "+others);
    }
    public void individualDetail()
    {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("CGPA: "+CGPA);
        System.out.println("Department: "+department);
    }
    public Student(String a, double b)
    {
        count++;
        name=a;
        CGPA=b;
        id=count;
        cse_student++;
    }
    public Student(String a, double b,String c)
    {
        count++;
        id=count;
        name=a;
        CGPA=b;
        department=c;
        if(department.equals("CSE"))
        {
            cse_student++;
        }
        else
        {
            others++;
        }
    }
}