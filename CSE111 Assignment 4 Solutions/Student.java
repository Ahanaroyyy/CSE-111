//Task 4
//public class Student
//{
//    public int id;
//    public double CG;
//    public int CG_count;
//    public int courses_count;
//    public String courses="";
//    public Student(int id)
//    {
//        this.id=id;
//        System.out.println("A student with ID "+this.id+" has been created.");
//    }
//    public Student(int id,double CG)
//    {
//        this.id=id;
//        this.CG=CG;
//        CG_count++;
//        System.out.println("A student with ID "+id+" and cgpa "+CG+" has been created.");
//    }
//    public void addCourse(String a)
//    {
//        if(CG_count ==0)
//        {
//            System.out.println("Failed to add "+a+" \nSet CG first");
//        }
//        else
//        {
//            if(CG_count<3 && courses_count==3)
//            {
//                System.out.println("Failed to add "+a+"\nCG is low. Can't add more than 3 courses");
//            }
//            else if(courses_count==4)
//            {
//                System.out.println("Failed to add "+a+"\nMaximum 4 courses allowed.");
//            }
//            else
//            {
//                courses_count++;
//                courses+=a+" ";
//            }
//
//        }
//    }
//    public void storeCG(double CG)
//    {
//        this.CG=CG;
//        CG_count++;
//    }
//    public void showAdvisee()
//    {
//        if(courses_count==0)
//        {
//            System.out.println("Student ID: "+id+", CGPA: "+CG+"\nNo courses added.");
//        }
//        else{
//        System.out.println("Student ID: "+id+", CGPA: "+CG+"\nAdded courses are:\n"+courses);}
//    }
//    public void removeAllCourse(){
//        courses_count=0;
//        courses="";
//    }
//    public void storeID(int a)
//    {
//        id=a;
//    }
//    public void addCourse(String [] str)
//    {
//        if(CG_count>0) {
//            if (str.length > 4) {
//                System.out.println("Failed to add " + str[str.length - 1] + "\nMaximum 4 courses allowed.");
//                courses_count = 4;
//                for (int i = 0; i < 4; i++) {
//                    courses += str[i] + " ";
//                }
//            } else if (str.length > 3 && CG < 3) {
//                courses_count = 3;
//                System.out.println("Failed to add " + str[str.length - 1] + "\nCG is low. Can't add more than 3 courses.");
//                for (int i = 0; i < 3; i++) {
//                    courses += str[i] + " ";
//                }
//            } else {
//                courses_count = str.length;
//                for (int i = 0; i < str.length; i++) {
//                    courses += str[i] + " ";
//                }
//            }
//        }
//    }
//}

//Task 8
public class Student
{
    public String name;
    public String email;
    public String password;
    public boolean login_status;
    public String department;
    public int id;
    public String courses="";
    public Student(String a, int b)
    {
        System.out.println("Student object is created");
        name=a;
        id=b;
    }
    public Student(String a, int b,String c)
    {
        System.out.println("Student object is created");
        name=a;
        id=b;
        department=c;
    }
}