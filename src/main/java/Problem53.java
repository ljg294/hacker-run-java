import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//Java Object Oriented Programming Java Iterator
public class Problem53 {

    static Iterator func(ArrayList arrayList){
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            Object object = iterator.next();
            if(object instanceof String)
                break;
        }
        return iterator;

    }
    @SuppressWarnings({ "unchecked" })
    public static void main(String []args){
        ArrayList arrayList = new ArrayList();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        for(int i = 0; i < n; i++){
            arrayList.add(scan.nextInt());
        }

        arrayList.add("###");
        for(int i=0;i<m;i++){
            arrayList.add(scan.next());
        }

        Iterator iterator = func(arrayList);
        while(iterator.hasNext()){
            Object object = iterator.next();
            System.out.println((String)object);
        }
    }
}
