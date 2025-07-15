/*
//Task 1
import java.util.Scanner;
public class Task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count=0;
        int min=999999999;
        int max=-99999999;
        int sum=0;
        for (int i=0;i<10;i++)
        {
            System.out.println("Enter number:");
            int x =sc.nextInt();
            if(x%2!=0 && x>0)
            {   count++;
                    if(x>max)
                    {
                        max=x;
                    }
                    if(x<min)
                    {
                        min=x;
                    }
                sum+=x;
            }
        }
        if(count>0)
        {
            double average=(double) sum/count;
            System.out.println("Sum = "+sum);
            System.out.println("Minimum = "+min);
            System.out.println("Maximum = "+max);
            System.out.println("Average = "+average);
        }
        else
        {
            System.out.println("No odd positive numbers found");
        }
    }
}
*/
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        double avg;
        int max=0;
        int min=0;
        int sum=0;
        int count=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int x = sc.nextInt();
            if(x%2!=0 && x>0) {
                sum += x;
                count++;
                if (count == 1) {
                    min = x;
                    max = x;
                } else {
                    if (x < min) {
                        min = x;
                    }
                    if (x > max) {
                        max = x;
                    }
                }
            }
        }
        avg = sum/count;
        System.out.println(sum+"\n"+min+"\n"+max+"\n"+avg);
    }
}
