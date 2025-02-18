import java.util.*;
public class two_D_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[10][10];
        for(int i = 0;i<rows;i++)
        {
            for(int j = 0;j< col;j++)
            {
                System.out.println("Enter the value of indexes " + i + j + " : ");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<rows;i++)
        {
            for(int j = 0;j< col;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
