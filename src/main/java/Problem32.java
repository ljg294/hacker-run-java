import java.util.Scanner;

//Java 2D Array
public class Problem32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        int res = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length - 1; i++) {
            int temp = 0;
            for (int j = 1; j < arr.length - 1; j++) {
                temp = arr[i][j]
                        + arr[i - 1][j - 1]
                        + arr[i - 1][j]
                        + arr[i - 1][j + 1]
                        + arr[i + 1][j - 1]
                        + arr[i + 1][j]
                        + arr[i + 1][j + 1];
                if (temp > res) {
                    res = temp;
                }
            }
        }
        System.out.println(res);
    }
}
