import java.util.Scanner;

//Java End-of-file
public class Problem9 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        for(int i = 1; scan.hasNext(); i++){
            String text = scan .nextLine();
            System.out.println(i +" "+text);
        }
    }
}
