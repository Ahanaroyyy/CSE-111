////Task 7
//import java.util.Scanner;
//public class Task7 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("N = ");
//        int n = sc.nextInt();
//        double [] arr = new double[n];
//        System.out.println("Please enter the elements of the array:");
//        for (int i = 0; i < n; i++)
//        {
//            arr[i]=sc.nextDouble();
//        }
//        int count=0;
//        for (int i = 0; i < n-1; i++)
//        {
//
//            if(arr[i]==arr[i+1])
//            {
//                for (int j=i+1;j<n;j++)
//                {
//                    if(arr[i]!=arr[j])
//                    {
//                        break;
//                    }
//                    count++;
//                    arr[i]=999999999;
//                    i++;
//                }
//            }
//        }
//        double[] new_arr=new double[n-count];
//        int index=0;
//        for (int i = 0; i < n; i++) {
//            if(arr[i]!=999999999)
//            {
//                new_arr[index]=arr[i];
//                index++;
//            }
//        }
//        System.out.print("New Array: ");
//        for (int i = 0; i < new_arr.length; i++) {
//            System.out.print(new_arr[i]+" ");
//        }
//        System.out.println();
//        System.out.println("Removed elements : "+count);
//    }
//}


//Task 7
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int removed=0;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i]==arr[i+1])
           {
               if (arr[i + 1] == arr [i+2])
               {
                   for (int j = i+1; j < arr.length ; j++) {
                       removed++;
                       i++;
                   }
               }

               removed++;

            }

        }
    }
}
