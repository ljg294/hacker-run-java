import java.util.*;

//Java Data Structures Data Java Sort
class Student {
    private int id;
    private String name;
    private double cgpa;
    public Student(int id, String name, double cgpa) {
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class Problem42 {
    public static void main(String[] args){
        Comparator<Student> order = (o1, o2) -> {
            if (o1.getCgpa() == o2.getCgpa()) {
                if (o1.getName().equals(o2.getName())) {
                    if (o1.getId() < o2.getId()) {
                        return 1;
                    }
                }

                return o1.getName().compareTo(o2.getName());
            }

            return o1.getCgpa() < o2.getCgpa() ? 1 : -1;
        };

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        List<Student> studentList = new ArrayList<>();
        while(scan.hasNext()){
            int id = scan.nextInt();
            String name = scan.next();
            double cgpa = scan.nextDouble();

            Student student = new Student(id, name, cgpa);
            studentList.add(student);

            n--;
        }

        Collections.sort(studentList, order);

        for(Student st: studentList){
            System.out.println(st.getName());
        }
    }
}
