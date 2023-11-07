import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

//Java Advanced Java Reflection - Attributes

public class Problem64 {
    public static void main(String[] args) throws ClassNotFoundException{
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method: methods){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String methodName: methodList){
            System.out.println(methodName);
        }
    }
}
