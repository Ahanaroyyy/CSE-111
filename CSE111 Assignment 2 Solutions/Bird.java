public class Bird {
    public String name;
    int feet_count=0;
    public void flyUp(int n)
    {
        feet_count+=n;
        System.out.println(name+" has flown up "+n+" feet.");
    }
    public void flyDown(int n)
    {
        feet_count-=n;
        if(feet_count<0)
        {
            System.out.println(name+ " cannot fly down "+n+" feet.");
            feet_count+=n;
        }
        else if(feet_count==0)
        {
            System.out.println(name+" has flown down "+n+" feet and landed.");
        }
        else {
            System.out.println(name+" has flown down "+n+" feet.");
        }

    }
    public void makeNoise()
    {
        if (name=="Parrot")
        {
            System.out.println("Squawk");
        }
        else if(name=="Eagle")
        {
            System.out.println("Squee");
        }
    }
}
