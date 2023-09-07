import java.math.BigDecimal;
import java.util.*;

//Java BigDecimal
public class Problem15 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] stringArray = new String[n];
        for(int i=0;i<n;i++){
            stringArray[i]=scan.next();
        }
        scan.close();
        Arrays.sort(stringArray, new Comparator<Object>(){
            public int compare(Object a1, Object a2) {
                BigDecimal bigDec1 = new BigDecimal((String)a1);
                BigDecimal bigDec2 = new BigDecimal((String)a2);
                if (bigDec1.doubleValue() == bigDec2.doubleValue())
                    return 0;
                return bigDec2.compareTo(bigDec1);
            }
        });

        for(int i=0;i<n;i++)
        {
            System.out.println(stringArray[i]);
        }
    }
}
