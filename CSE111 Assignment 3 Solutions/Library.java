//Task 4
public class Library {
public int capacity;
public int book_count=0;
String [] book;
public String str="";
public void setBookCapacity(int n)
{
    capacity=n;
    book = new String[n];
}
public void addBook(String str)
{

    if(book_count<capacity)
    {

        this.book[book_count]=str;
        System.out.println("Book '"+str+"' added to the library");
        book_count++;
    }
    else
    {
        System.out.println("Maximum capacity exceeds. You can't add more than "+capacity+" books");
    }

}
public void printDetail(){
    System.out.println("Maximum Capacity: "+capacity);
    System.out.println("Total Books: "+book_count);
    System.out.println("Book list:");
    for (int i = 0; i < book_count; i++)
    {
        System.out.println(book[i]);
    }
}
}
