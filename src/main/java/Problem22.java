import java.util.Scanner;

//Java Substring Comparison
public class Problem22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int k = scan.nextInt();

        String[] subStr = new String[s.length() - (k-1)];
        subStr[0] = s.substring(0,k);

        for(int i = 1; i < subStr.length; i++) {
            subStr[i] = s.substring(i,i + k);
        }

        for(int i = 0; i < subStr.length; i++) {
            for(int j = 0; j < subStr.length - i - 1; j++) {
                if(subStr[j].compareTo(subStr[j + 1]) > 0) {
                    String temp = subStr[j];
                    subStr[j] = subStr[j + 1];
                    subStr[j + 1] = temp;
                }
            }
        }

        System.out.println(subStr[0] + "\n" + subStr[subStr.length - 1]);
    }
}
