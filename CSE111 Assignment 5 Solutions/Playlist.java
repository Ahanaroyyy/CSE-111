//public class Playlist {
//    public String name;
//    public int count=0;
//    public Song head;
//    public Playlist(String a)
//    {
//        name =a;
//        System.out.println(name +" created.");
//    }
//    public void addSong(Song a)
//    {
//        System.out.println(a.title +" added to "+ name +".");
//        if(head==null)
//        {
//            head=a;
//        }
//        else
//        {
//            Song temp = head;
//            while(temp.next!=null)
//            {
//                temp=temp.next;
//            }
//            temp.next=a;
//        }
//    }
//    public void info()
//    {
//        System.out.println(name +" has the following songs:");
//        int index=1;
//        Song temp=head;
//        if(temp==null)
//        {
//            System.out.println("No songs in "+ name +".");
//        }
//        else if(temp.next==null)
//        {
//            System.out.println("Song-"+index);
//            temp.songInfo();
//        }
//        else
//        {
//            while (temp!= null) {
//                System.out.println("Song-"+index);
//                temp.songInfo();
//                index++;
//                temp=temp.next;
//            }
//        }
//    }
//    public void addSong(Song a,int b)
//    {
//        Song temp=head;
//        if(b==0)
//        {   if(head==null)
//        {
//            head=a;
//            System.out.println(a.title + " added to " + name + ".");
//        }
//        else
//        {
//           a.next=head;
//            head=a;
//            System.out.println(a.title + " added to " + name + ".");}
//        }
//        else {
//            for (int i = 0; i < b-1; i++) {
//                if (temp==null)break;
//                temp = temp.next;
//            }
//            if (temp == null) {
//                System.out.println("Cannot add song to Index " + b);
//            } else {
//                System.out.println(a.title + " added to " + name + ".");
//                Song current = temp.next;
//                temp.next=a;
//                a.next=current;
//            }
//        }
//    }
//    public void playSong(String a)
//    {
//        boolean flag=false;
//        Song temp=head;
//        while(temp!=null)
//        {
//            if(temp.title==a)
//            {
//                flag=true;
//                break;
//            }
//            temp=temp.next;
//        }
//        if(flag)
//        {
//            System.out.println("Playing "+a+" by "+temp.artist+".");
//        }
//        else
//        {
//            System.out.println(a+" not found in playlist "+ name +".");
//        }
//    }
//    public void playSong(int a)
//    {
//        Song temp=head;
//        for (int i = 0; i < a; i++) {
//            if(temp==null)break;
//            temp=temp.next;
//        }
//        if(temp==null) {
//            System.out.println("Song at Index " + a + " not found in " + name +".");
//        }
//        else
//        {
//            System.out.println("Playing "+temp.title+" by "+temp.artist+".");
//        }
//    }
//    public void deleteSong(String a)
//    {Song dummy = new Song("a","B",6);
//        dummy.next=head;
//        Song temp=dummy;
//        boolean flag=true;
//        while(temp.next!=null)
//        {
//            if(a.equals(temp.next.title))
//            {
//                temp.next=temp.next.next;
//                    flag = false;
//                    System.out.println(a + " deleted from " + name + ".");
//                    break;
//                }
//            temp=temp.next;
//        }
//        if(flag)
//        {
//            System.out.println(a+" not found in "+ name +".");
//        }
//        head=dummy.next;
//    }
//    public int totalSong()
//    {
//        Song temp=head;
//        while(temp!=null)
//        {
//            count++;
//            temp=temp.next;
//        }
//        return count;
//    }
//    public void merge(Playlist a)
//    {
//        Song temp=head;
//        while(temp.next!=null)
//        {
//            temp=temp.next;
//        }
//        temp.next=a.head;
//        System.out.println("Merge Completed!");
//    }
//}
public class Playlist {
    public String name;
    public int count;
    public Song head;
    public Song history;
    public Playlist(){
        name="History";
    }
    public Playlist(String a)
    {
        name=a;
        System.out.println(a+" created.");
    }
    public void info()
    {
        System.out.println(name+" has the following songs:");
        if(count==0)
        {
            System.out.println("No songs in "+name);
        }
        else
        {
         int a=1;
            Song temp = head;
            if(temp.next==null)
            {
                System.out.println("Song-"+a);
                temp.songInfo();
            }
            else {
                while (temp.next != null) {
                    System.out.println("Song-" + a);
                    temp.songInfo();
                    a++;
                    temp = temp.next;
                }
                System.out.println("Song-" + a);
                temp.songInfo();
            }
        }
    }
    public void addSong(Song a) {
        System.out.println(a.title + " added to " + name + ".");
        if (head == null) {
            head = a;
            count++;
        } else {
            Song temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = a;
            count++;
        }
    }

    public void addSong(Song a,int b) {
        Song temp = head;

        if (b == 0) {
            a.next=head;
            head=a;
            System.out.println(a.title + " added to " + name);
            count++;
        } else {
            for (int i = 0; i < b - 1; i++) {
                if(temp==null)break;
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Can't");
            } else {
                System.out.println(a.title + " added to " + name);
                Song current = temp.next;
                temp.next = a;
                a.next = current;
                count++;
            }

        }
    }
    public void playSong (String a) {
        Song temp = head;
        boolean flag = false;
        for (int i = 0; i < count; i++) {
            if(temp.title.equals(a))
            {
                flag=true;
                break;
            }
            temp=temp.next;
        }
        if(flag)
        {
            System.out.println("Playing "+temp.title+" by "+temp.artist);
            Song historySong = new Song (temp.title,temp.artist ,temp.length);
            if (history==null)
            {
               history=historySong;
            }
            else
            {
                Song temp2 = history;
                while(temp2.next!=null)
                {
                    temp2=temp2.next;
                }
                temp2.next=historySong;
            }
        }
        else
        {
            System.out.println("Not found");
        }
    }
    public void playSong(int a) {
        if(a>=count)
        {
            System.out.println("Song at Index "+a+" not");
        }
        else
        {
            Song temp = head;
            for (int i = 0; i < a; i++) {
                temp=temp.next;
            }
            System.out.println("Playing "+temp.title);
            Song historySong = new Song (temp.title,temp.artist ,temp.length);
            if (history==null)
            {
                history=historySong;
            }
            else
            {
                Song temp2 = history;
                while(temp2.next!=null)
                {
                    temp2=temp2.next;
                }
                temp2.next=historySong;
            }
        }
    }
    public void deleteSong(String a) {
        Song temp = head;
        boolean flag = false;
        int index=0;
        for (int i = 0; i < count; i++) {
            if(temp.title.equals(a))
            {
                flag=true;
                index=i;
                break;
            }
            temp=temp.next;
        }
        if(!flag)
        {
            System.out.println(a+" not found");
        }
        else
        {
            Song temp2 = head;
            if(index==0)
            {
                head=head.next;
                System.out.println(a+" deleted");
                count--;
            }
            else {
                for (int i = 0; i < index - 1; i++) {
                    temp2 = temp2.next;
                }
                if(temp2.next.next!=null){temp2.next=temp2.next.next;}
                else {temp2.next=null;}
                System.out.println(a+" deleted");
                count--;
            }
        }
    }
    public void merge(Playlist a) {

        Song temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=a.head;
    }
    public void showHistory()
    {
        System.out.println("History of "+name);
        if(history==null)
        {
            System.out.println("no songs were played");
        }
        else
        {

            Song temp = history;
            while(temp.next!=null)
            {
                temp.songInfo();
                temp=temp.next;
            }
            temp.songInfo();
        }
    }

}