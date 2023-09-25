import java.util.Scanner;

//Java Data Structures Java Subarray
public class Problem33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        int[] prefix = new int[arr.length];
        int sum = 0;
        int count = 0;

        prefix[0]=arr[0];
        for(int i=1 ; i<arr.length ; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i = 0; i < arr.length;i++){
            for(int j = i; j < arr.length; j++){
                sum = i == 0 ? prefix[j]: prefix[j]-prefix[i-1];
                if(sum<0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
