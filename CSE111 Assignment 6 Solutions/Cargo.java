////Task 6
//public class Cargo {
//    public static double capacity=10;
//    private String contents;
//    private double weight;
//    private boolean flag=false;
//    private int cargo_id;
//    public static int count=1;
//
//    public static double capacity(){
//        return capacity;
//    }
//    public Cargo(String a,double b)
//    {
//        contents=a;
//        weight=b;
//        cargo_id=count;
//        count++;
//    }
//    public void load()
//    {
//        if(weight>capacity)
//        {
//            System.out.println("Cannot load cargo, exceeds weight capacity.");
//        }
//        else {
//            capacity -= weight;
//            flag = true;
//            System.out.println("Cargo "+cargo_id + " is loaded for transport.");
//        }
//    }
//    public void unload()
//    {
//        System.out.println("Cargo "+cargo_id+" unloaded.");
//        capacity+=weight;
//        flag=false;
//    }
//    public void details()
//    {
//        System.out.println("Cargo ID: "+cargo_id+", Contents: "+contents+", Weight: "+weight+", Loaded: "+flag);
//    }
//}
public class Cargo {
    public static double capacity = 10.0;
    public static int ID=1;
    private int id;
    private String name;
    private double weight;
    private boolean loaded;

    public Cargo(String a, double b)
    {
        id=ID;
        ID++;
        name=a;
        weight=b;
    }
    public static double capacity()
    {
        return capacity;
    }
    public void details()
    {
        System.out.println("Cargo ID: "+id+", Contents: "+name+", Weight: "+weight+", Loaded: "+loaded);
    }
    public void load()
    {
        if(capacity-weight<0)
        {
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
        else
        {
        loaded=true;
        capacity-=weight;
        System.out.println("Cargo "+id+" loaded for transport.");}
    }
    public void unload()
    {
        loaded=false;
        capacity+=weight;
        System.out.println("Cargo "+id+" unloaded.");
    }


}