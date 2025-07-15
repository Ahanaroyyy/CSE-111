//Task 6
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N= ");
        int [] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        boolean [] arr2 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            if(!arr2[i])
            {
                int count=0;
                for (int j = 0; j < arr.length; j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                        arr2[j]=true;
                    }
               }
                System.out.println(arr[i]+" - "+count+" times");
            }
        }
    }
}
