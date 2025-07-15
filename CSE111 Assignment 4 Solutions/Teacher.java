// Task 6
public class Teacher {
    public String name;
    public String initial;
    public int count=0;
    public String Courses="";
    public Teacher(String a,String b)
    {
        name=a;
        initial=b;
        System.out.println("A new teacher has been created");
    }
    public void addCourse(Course a)
    {
        if(count<3)
        {
            Courses+="\n"+a.course;
            count++;
        }
    }
    public void printDetail()
    {
        System.out.println("Name: "+name);
        System.out.println("Initial: "+initial);
        System.out.println("List of courses:"+Courses);
    }
}
