//Task 5
public class Course {
    public String Course_Name,code;
    public int credit;
    public void updateDetails(String x,String y,int z)
    {
        Course_Name =x;
        code=y;
        credit=z;
    }
    public void displayCourse()
    {
        System.out.println("Course Name: "+Course_Name);
        System.out.println("Course Code: "+code);
        System.out.println("Course Credit: "+credit);
    }
}
