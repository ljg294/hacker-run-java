import java.util.*;

//Java Data Structures Data Java Map
public class Problem37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        Map<String, String> namePhoneMap = new HashMap<>();

        for(int i = 0; i < n; i ++){
            String name = scan.nextLine();
            String phoneNumber = scan.nextLine();
            namePhoneMap.put(name, phoneNumber);
        }

        while(scan.hasNext()){
            String nameKey = scan.nextLine();
            if(namePhoneMap.containsKey(nameKey))
                System.out.println(nameKey + "=" + namePhoneMap.get(nameKey));
            else
                System.out.println("Not found");
        }
    }
}
