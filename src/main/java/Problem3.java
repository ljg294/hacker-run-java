import java.util.Scanner;

//Java If-Else
public class Problem3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        if(N%2 == 1){
            System.out.println("Weird");
        }
        else if(N > 5 && N <= 20){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
    }

}
