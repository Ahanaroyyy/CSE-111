//Task 9
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
//        int [] [] matrix = new int [sc.nextInt()][sc.nextInt()];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix [i] [j] = sc.nextInt();
//            }
//        }
//
//        boolean flag = true;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//               if (i==j)
//               {
//                   if ( matrix [i][j]!=1)
//                   {
//                       flag=false;
//                       break;
//                   }
//               }
//               else
//               {
//                   if ( matrix [i][j]!=0)
//                   {
//                       flag = false;
//                       break;
//                   }
//               }
//            }
//            if (!flag)
//            {
//                System.out.println("Not an Identity Matrix");
//                break;
//            }
//        }
//        if(flag)
//        {
//            System.out.println("Identity Matrix");
//        }
        int [ ] [ ] A = {{1,  0,  0},
                        {0,  1,  0},
                        {0,  0,  1}};
      boolean flag = false;
        for (int i = 0; i < A.length; i++)
        {
            for (int j = 0; j < A[i].length; j++)
            {
               if(i==j)
               {
                   if(A[i][j]!=1)
                   {
                       flag=true;
                   }
               }
               else
               {
                   if(A[i][j]!=0)
                   {
                       flag=true;
                   }
               }
            }
        }
        System.out.println(flag);
    }
}