//Task 5
public class Borrower {
    public static int book_count[] = {3, 3, 3};
    public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
    private String name;
    private String borrowed="";
    public Borrower(String a)
    {
        name=a;
    }
    public void setName(String a)
    {
        name=a;
    }
    public String getName()
    {
        return name;
    }
    public void borrowBook(String a)
    {
        for (int i = 0; i < book_name.length; i++)
        {
            if(a.equals(book_name[i]))
            {
               if(book_count[i]==0)
               {
                   System.out.println("This book is not available.");
               }
               else
               {
                   borrowed+="\n"+a;
                   book_count[i]-=1;
               }
            }
        }
    }
    public static void bookStatus()
    {
        System.out.println("Available Books:");
        for (int i = 0; i < book_name.length; i++) {
            System.out.println(book_name[i]+": "+book_count[i]);
        }
    }
    public void borrowerDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Books Borrowed:"+borrowed);
    }
    public static int remainingBooks(String a)
    {
        int j=0;
        for (int i = 0; i < book_name.length; i++) {
         if(book_name[i].equals(a))
         {
            j=book_count[i];
            break;
         }
        }
        return j;
    }
}