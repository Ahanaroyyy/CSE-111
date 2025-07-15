////Task 2
//import java.util.Scanner;
//public class Task2{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int x=sc.nextInt();
//        int y=sc.nextInt();
//        int temp;
//        int prime_count=0;
//        if(y>x)
//        {
//            temp=x;
//            x=y;
//            y=temp;
//        }
//        for (int i=y;i<=x;i++)
//        {
//            int count=0;
//            for(int j=1;j<=i;j++)
//            {
//                if(i%j==0)
//                {
//                    count++;
//                }
//            }
//            if(count==2)
//            {
//                prime_count++;
//            }
//        }
//        System.out.println("There are "+prime_count+" prime numbers between "+y+" and "+x+".");
//    }
//}

import java.util.Scanner;
 public class Task2{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    if(x>y)
    {
        int temp=x;
        x=y;
        y=temp;
    }
    int count=0;
    for (int i = x; i <= y ; i++) {
        int prime_count=0;
        for (int j = 1; j < i; j++) {

            if(i%j==0)
            {
                prime_count++;
            }
        }
        if (prime_count==1)
        {
            count++;
        }
    }
    System.out.println(count);
    }
}