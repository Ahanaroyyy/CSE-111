//Task 4
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String str2="";
//
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) == 'a') {
//                    str2 += 'z';
//                } else {
//                    str2 += (char) (str.charAt(i) - 1);
//                }
//            }
//            System.out.println(str2);
        Scanner sc = new Scanner (System.in);
        String x = sc.nextLine();
        String y="";
        for (int i = 0; i < x.length(); i++) {

            if(x.charAt(i)=='a')
            {
                y+='z';
            }
            else
            {
                y+=(char)(x.charAt(i)-1);
            }
        }
        System.out.println(y);
        }
    }

