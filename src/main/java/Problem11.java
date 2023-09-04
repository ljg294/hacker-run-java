import java.util.Scanner;

//Java Int to String
public class Problem11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String text = String.valueOf(n);
        if(text instanceof String){
            System.out.println("Good job");
        }
        else{
            System.out.println("Respuesta incorrecta");
        }
    }
}
