import java.util.Scanner;

//Java Static Initializer Block
public class Problem10 {
    static int B;
    static int H;
    static Scanner scan = new Scanner(System.in);

    static{
        B = scan.nextInt();
        H = scan.nextInt();
        try{
            if(B <= 0 || H <= 0)
                throw new Exception("Breadth and height must be positive");
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if (B > 0 && H > 0)
            System.out.println(B * H);
    }
}
