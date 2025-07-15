//Task 3
import java.util.Scanner;
public class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x =sc.nextLine();
        String y =sc.nextLine();
        String z = x+" "+y;
        int sum=0;
        for(int i=0;i<z.length();i++)
        {
            if((z.charAt(i)>='a' && z.charAt(i)<='z') || (z.charAt(i)>='A' && z.charAt(i)<='Z'))
            {
                sum+=z.charAt(i);
            }
        }
        System.out.println(z);
        System.out.println(sum);
    }
}    