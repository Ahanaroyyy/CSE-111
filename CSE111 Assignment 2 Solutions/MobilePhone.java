public class MobilePhone {
    public int capacity;
    public int count;
    public String [] names;
    public int[] numbers;
    public void setContactCapacity(int a)
    {
        capacity=a;
        names= new String[capacity];
        numbers = new int [capacity];
    }
    public void details()
    {
        System.out.println("Total Contacts: "+count+"\nContact List:");
        if(count!=0)
        {
            for (int i = 0; i < count; i++) {
                System.out.println(names[i]+":"+numbers[i]);
            }
        }

    }
    public void addContact(String a, int b)
    {
        if(count<capacity)
        {
            System.out.println("The contact of "+a+" is added.");
            names[count]=a;
            numbers[count]=b;
            count++;
        }
        else
        {
            System.out.println("Storage Full!!");
        }
    }
    public void makeCall(int a)
    {
        boolean flag =false;
        int index = 0;
        for (int i = 0; i <count ; i++) {
            if(numbers[i]==a)
            {
                flag=true;
                index=i;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Calling "+names[index]+". . .");
        }
        else
        {
            System.out.println("Calling "+a);
        }
    }
}