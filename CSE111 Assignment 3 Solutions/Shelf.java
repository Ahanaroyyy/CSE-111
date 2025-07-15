//Task 3
public class Shelf {
    public int capacity=0;
    public int books=0;
    public void showDetails(){
        System.out.println("Shelf capcity: "+capacity);
        System.out.println("Number of books: "+books);
    }
    public void addBooks(int n){
        books+=n;
        if(capacity>books)
        {
            System.out.println(n+" books added to shelf");
        }
        else if(books>capacity && capacity!=0)
        {
            books-=n;
            System.out.println("Exceeds capacity");
        }
        else if(capacity==0) {
            books-=n;
            System.out.println("Zero capacity.Cannot add books.");
        }
    }
}
