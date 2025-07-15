//Task 8
public class Usis {
    public Student[] arr = new Student[5];
    public int totalAdvisee=0;
    public Usis()
    {
        System.out.println("Usis is ready to use!");
    }
    public void login(Student a)
    {
        if(a.email==null || a.password==null)
        {
            System.out.println("Email and password need to be set.");
        }
        else
        {
            a.login_status=true;
            System.out.println("Login successful");
        }
    }
    public void advising(Student a)
    {
        if(a.login_status) {
            if (a.courses.equals("")) {
                System.out.println("You haven't selected any courses.");
            }
        }
        else
        {
            System.out.println("Please login to advise courses!");
        }
    }
    public void advising(Student a,String b,String c,String d,String e)
    {
        if(!a.login_status)
        {
            System.out.println("Please login to advise courses!");
        }
        else {
            System.out.println("You need special approval to take more than 3 courses");
        }
    }
    public void advising(Student a,String b,String c,String d)
    {
        if(!a.login_status)
        {
            System.out.println("Please login to advise courses!");
        }
        else {
            a.courses = b + " " + c + " " + d;
            arr[totalAdvisee] = a;
            totalAdvisee++;
            System.out.println("Advising successful!");
        }
    }
    public void allAdviseeInfo()
    {
        System.out.println("Total Advisee: "+totalAdvisee);
        for (int i = 0; i < totalAdvisee; i++) {
            System.out.println("Name: "+arr[i].name+" ID: "+arr[i].id+"\nDepartment: "+arr[i].department+"\nAdvised Courses:\n"+arr[i].courses);
            System.out.println("==============");
        }
    }

}
