//TASK 10
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr2D = {{0, 0, 10, 0, -1},
                {0, -1, 0, 0, -1},
                {-1, 0, -1, 0, 0},
                {0, -1, 0, 0, 7},
                {0, -1, 0, -1, 0}
        };
//        System.out.println("Initial Map: ");
//        for (int i = 0; i < arr2D.length; i++) {
//            for (int j = 0; j < arr2D[i].length; j++) {
//                System.out.print(arr2D[i][j]+" ");
//            }
//            System.out.println();
//        }
//        int row = arr2D.length;
//        int col = arr2D[0].length;
//        int row_pos=-1; int col_pos=-1;
//        boolean flag = false;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                if (arr2D [i][j]==7)
//                {
//                    row_pos=i;
//                    col_pos=j;
//                    flag=true;
//                    break;
//                }
//                if(flag)
//                {
//                    break;
//                }
//            }
//        }
//        int turns = 5;
//        int new_row = row_pos, new_col = col_pos;
//        while (turns > 0) {
//            System.out.printf("Enter move %d: ", (6 - turns));
//            String inp = sc.nextLine();
//            if ( inp.equals("UP"))
//            {
//                new_row-=1;
//                if (new_row<0)
//                {
//                    System.out.println("Player fell outside the playing area. Game over!");
//                    break;
//                }
//                if(arr2D[new_row][new_col]==-1)
//                {
//                    System.out.println("Player stepped on mine. Game Over!");
//                    break;
//                }
//                if(arr2D[new_row][new_col]==10)
//                {
//                    System.out.println("Treasure found. You win!");
//                    break;
//                }
//                arr2D[new_row][new_col]=7;
//                arr2D[new_row+1][new_col]=0;
//                System.out.println("Current state:");
//                for (int i = 0; i < arr2D.length; i++) {
//                    for (int j = 0; j < arr2D[i].length; j++) {
//                        System.out.print(arr2D[i][j]+" ");
//                    }
//                    System.out.println();
//                }
//            }
//            if ( inp.equals("DOWN"))
//            {
//                new_row+=1;
//                if (new_row== arr2D.length)
//                {
//                    System.out.println("Player fell outside the playing area. Game over!");
//                    break;
//                }
//                if(arr2D[new_row][new_col]==-1)
//                {
//                    System.out.println("Player stepped on mine. Game Over!");
//                    break;
//                }
//                if(arr2D[new_row][new_col]==10)
//                {
//                    System.out.println("Treasure found. You win!");
//                    break;
//                }
//                arr2D[new_row][new_col]=7;
//                arr2D[new_row-1][new_col]=0;
//                System.out.println("Current state:");
//                for (int i = 0; i < arr2D.length; i++) {
//                    for (int j = 0; j < arr2D[i].length; j++) {
//                        System.out.print(arr2D[i][j]+" ");
//                    }
//                    System.out.println();
//                }
//            }
//            if ( inp.equals("LEFT"))
//            {
//                new_col-=1;
//                if (new_col<0)
//                {
//                    System.out.println("Player fell outside the playing area. Game over!");
//                    break;
//                }
//                if(arr2D[new_row][new_col]==-1)
//                {
//                    System.out.println("Player stepped on mine. Game Over!");
//                    break;
//                }
//                if(arr2D[new_row][new_col]==10)
//                {
//                    System.out.println("Treasure found. You win!");
//                    break;
//                }
//                arr2D[new_row][new_col]=7;
//                arr2D[new_row][new_col+1]=0;
//                System.out.println("Current state:");
//                for (int i = 0; i < arr2D.length; i++) {
//                    for (int j = 0; j < arr2D[i].length; j++) {
//                        System.out.print(arr2D[i][j]+" ");
//                    }
//                    System.out.println();
//                }
//            }
//            if ( inp.equals("RIGHT"))
//            {
//                new_col+=1;
//                if (new_col== arr2D.length)
//                {
//                    System.out.println("Player fell outside the playing area. Game over!");
//                    break;
//                }
//                if(arr2D[new_row][new_col]==-1)
//                {
//                    System.out.println("Player stepped on mine. Game Over!");
//                    break;
//                }
//                if(arr2D[new_row][new_col]==10)
//                {
//                    System.out.println("Treasure found. You win!");
//                    System.out.println("Final state:");
//                    for (int i = 0; i < arr2D.length; i++) {
//                        for (int j = 0; j < arr2D[i].length; j++) {
//                            System.out.print(arr2D[i][j]+" ");
//                        }
//                        System.out.println();
//                    }
//                    break;
//                }
//                arr2D[new_row][new_col]=7;
//                arr2D[new_row][new_col-1]=0;
//                System.out.println("Current state:");
//                for (int i = 0; i < arr2D.length; i++) {
//                    for (int j = 0; j < arr2D[i].length; j++) {
//                        System.out.print(arr2D[i][j]+" ");
//                    }
//                    System.out.println();
//                }
//            }
//            turns--;
//        }
        int row_pos=1;
        int col_pos=1;
        System.out.println("Initial Map:");
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if(arr2D[i][j]==7)
                {
                    row_pos=i;
                    col_pos=j;
                }
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
       int turn = 5;
        int i=0;
        int new_row=0;
        int new_col=0;
        while(i<turn)
        {
            System.out.println("Enter move "+(i+1)+":");
            String inp = sc.nextLine();
            if(inp.equals("RIGHT"))
            {
                new_row=row_pos;
                new_col=col_pos+1;
                if(new_col>=arr2D[0].length)
            {
                System.out.println("Outside");
                break;
            }
                if(arr2D[new_row][new_col]==-1)
                {
                    System.out.println("Mine!!!");
                    break;
                }

                else if(arr2D[new_row][new_col]==10)
                {
                    System.out.println("Treasure!");
                    arr2D[row_pos][col_pos]= 0;
                    arr2D[new_row][new_col]=7;
                    System.out.println("Final State");
                    for (int j = 0; j < arr2D.length; j++) {
                        for (int k = 0; k < arr2D[0].length; k++) {
                            System.out.print(arr2D[j][k]+" ");
                        }
                        System.out.println();
                    }
                    col_pos+=1;
                    break;
                }
                else
                {
                    arr2D[row_pos][col_pos]= 0;
                    arr2D[new_row][new_col]=7;
                    System.out.println("Current State");
                    for (int j = 0; j < arr2D.length; j++) {
                        for (int k = 0; k < arr2D[0].length; k++) {
                            System.out.print(arr2D[j][k]+" ");
                        }
                        System.out.println();
                    }
                    col_pos+=1;
                }
            }
            i++;
        }


    }
}