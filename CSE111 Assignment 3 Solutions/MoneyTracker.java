public class MoneyTracker {
    public double balance;
    public String name;
    public double history_add;
    public double history_expense;

    public String info()
    {
        return "Name: "+name+"\nCurrent Balance: "+balance;
    }
    public void createTracker(String a)
    {
        name=a;
        balance=1.0;
    }
    public void income (double a)
    {
        System.out.println("Balance Updated.");
        balance+=a;
        history_add=a;
    }
    public void expense(double a)
    {
        if((balance-a)<0)
        {
            System.out.println("Not enough balance.");
        }
        balance-=a;
        history_expense=a;
        if(balance==0)
        {
            System.out.println("You're broke!");
        }
    }
    public void showHistory()
    {
        System.out.println("Last added: "+history_add );
        System.out.println("Last Spent: "+history_expense);
    }
}
