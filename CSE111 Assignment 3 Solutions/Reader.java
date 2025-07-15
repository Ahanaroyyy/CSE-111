//Task 8
public class Reader {
    public String name;
    public String books="No books added yet";
    public int capacity;
    public String[]book_list;
    public int count=0;
    public void readerInfo()
    {
        System.out.println("Name:" +name);
        System.out.println("Capacity: "+capacity);
        System.out.println("Books:");
        if(count==0)
        {
            System.out.println("No books yet");
        }
        else
        {
            for (int i = 0; i < count; i++)
            {
                System.out.println("Book "+(i+1)+": "+book_list[i]);
            }
        }
    }
    public String  createReader(String str, int n)
    {
        book_list= new String[n];
        name=" "+str;
        capacity=n;
        return "A new reader is created!";
    }
    public void addBook(String str)
    {
        if(count<capacity)
        {
        book_list[count]=str;
        count++;}
        else
        {
            System.out.println("No more capacity");
        }
    }
}
