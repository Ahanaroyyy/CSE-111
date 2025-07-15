public class Song {
    public String artist;
    public String title;
    public int length ;
    public Song next;
    public Song(String a,String b, int c)
    {
        title=a;
        artist=b;
        length=c;
    }
    public void songInfo()
    {
        System.out.println("Title: "+title);
        System.out.println("Artist: "+artist);
        System.out.println("Length: "+length+" minutes");
    }
}
