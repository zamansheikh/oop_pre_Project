import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("John", "123", 90));
        students.add(new Student("Jane", "456", 55));
        students.add(new Student("Aack", "789", 100));
        System.out.println(students);
        Student.sortViaName(students);
        System.out.println(students);
    }
    
}
