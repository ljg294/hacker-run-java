import java.io.*;
import java.util.*;

//Java Loops II
public class Problem7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            for(int j = 0; j <n ; j++) {
                a = a + ((int)Math.pow(2,j) * b);
                System.out.print(a + " ");
            }
            System.out.print("\n");
        }
    }
}
