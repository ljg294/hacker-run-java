import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

//Java Data Structures Data Java Hashset
public class Problem40 {

    public static void main(String[] args) {
        List<Integer> listNum = new ArrayList<>();
        listNum.add(1);
        listNum.add(2);
        listNum.add(3);


        List<String> listString = new ArrayList<>();
        listString.add("Hello");
        listString.add("World");

        printArray(listNum);
        printArray(listString);

    }

    public static void printArray(List<? extends Object> listValue) {
        for(int i= 0; i< listValue.size(); i++) {
            System.out.println(listValue.get(i));
        }
    }
}
