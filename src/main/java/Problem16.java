import java.math.BigInteger;
import java.util.Scanner;

//Java Primality Test
public class Problem16 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        BigInteger bigInteger = scan.nextBigInteger();
        if(bigInteger.isProbablePrime(BigInteger.ONE.intValue())){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
