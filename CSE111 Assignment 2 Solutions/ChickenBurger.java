//public class ChickenBurger {
//    public String bun ="Sesame";
//    public int price = 200;
//    public String sauceOption="Less";
//    public String spiceLevel="Not Set";
//    public String serveBurger()
//    {
//        if(spiceLevel=="Not Set")
//        {
//            return "Cannot serve now. Customize Spice Level first.";
//        }
//        else
//        {
//            return "The burger is being served:- \nBun Type: "+bun+"\nPrice : "+price+"\nSauce Option: "+sauceOption+"\nSpice Level: "+spiceLevel;
//        }
//    }
//    public void customizeSpiceLevel(String n) {
//        spiceLevel = n;
//        if (spiceLevel == "Spicy" || spiceLevel == "Naga") {
//            System.out.println("Spice level set to " + spiceLevel);
//        } else {
//            System.out.println("This spice level is unavailable.");
//        }
//    }
//}
public class ChickenBurger {
    public String bun="Sesame";
    public int price=200;
    public String sauceOption="Less";
    public String spiceLevel = "Not Set";
    public boolean spice = false;
    public String serveBurger()
    {
        if(!spice)
        {
            return "Cannot serve now. Customize Spice Level first.";
        }
        else
        {
            return "The burger is being served:-\nBun Type: "+bun+"\nPrice: "+price+"\nSauce Option: "+sauceOption+"\nSpice Level"+spiceLevel;
        }
    }
    public void customizeSpiceLevel(String a)
    {
        if(a.equals("Mild")|| a.equals("Spicy")||a.equals("Naga")||a.equals("Extreme"))
        {
            spiceLevel=a;
            System.out.println( "Spice level set to "+a+".");
            spice=true;
        }
        else
        {
            System.out.println("This spice level is unavailable");
        }
    }
}