//Task 5
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the length of the array: ");
//        int arr_length = sc.nextInt();
//        int[] arr=new int[arr_length];
//        for (int i = 0; i < arr_length; i++) {
//            arr[i]=sc.nextInt();
//        }
//        for (int i = 0; i < arr_length/2; i++)
//        {
//            int temp = arr[i];
//            arr[i]=arr[arr_length-(i+1)];
//            arr[arr_length-(i+1)]=temp;
//        }
//        for (int i = 0; i < arr_length; i++) {
//            System.out.print(arr[i]+" ");
        int [] arr1 = {5,6,7,8,9,4,3,2};
        int index = arr1.length-1;
        for (int i = 0; i < arr1.length/2; i++) {
            int temp = arr1[i];
            arr1[i]=arr1[index];
            arr1[index]=temp;
            index--;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+", ");

        }
    }
}