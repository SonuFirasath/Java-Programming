import java.util.*;

public class exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[rows][col];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the value of indices " + i + j + " : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the value that you want to search in the matrix : ");
        int num = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == num) {
                    System.out.print("Number found at indices : " + i + j);
                    break;
                }
            }
        }
    }
}