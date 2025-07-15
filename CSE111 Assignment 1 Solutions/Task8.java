//Task 8
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("row = ");
        int row = sc.nextInt();
        System.out.println("column = ");
        int column = sc.nextInt();
        int [][] arr1 = new int [row][column];
        int [] arr2 = new int [(row*column)];
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr1[i].length; j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        int index=0;
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr1[i].length; j++)
            {
                arr2[index]=arr1[i][j];
                index++;
            }
        }
        System.out.println("2D Array:");
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr1[i].length; j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("1D Array:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}