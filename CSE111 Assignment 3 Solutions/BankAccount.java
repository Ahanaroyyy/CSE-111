//Task 1
public class BankAccount {
        public int account_no=0;
        public String type="Not Set";
        public String printDetails(){
            return ("Account No: "+account_no+"\n"+
             "Type: "+type);
        }
        public void setInfo(int n,String str)
        {
            account_no=n;
            type=str;
            System.out.println("Account information updated!");
        }
    }

