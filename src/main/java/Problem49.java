import java.util.Scanner;

//Java Object Oriented Programming Java Interface
interface AdvancedArithmetic
{
    public abstract int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic
{

    @Override
    public int divisorSum(int n)
    {
        int sum=0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                sum = sum + i;
        }
        return sum;
    }
}
public class Problem49
{
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        int inputNumber = scan.nextInt();
        Calculator calculator = new Calculator();
        System.out.print("I implemented: AdvancedArithmetic\n" + calculator.divisorSum(inputNumber));
    }
}
