import java.util.*;

public class Student {
    public String name;
    public String id;
    private int mark;
    public String result;

    public Student(String name, String id, int mark) {
        this.name = name;
        this.id = id;
        this.setMark(mark);
        this.result = returnResult(mark);
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public String returnResult(int mark) {
        if (this.getMark() >= 80 && this.getMark() <= 100) {
            return "A+";
        } else if (this.getMark() >= 70 && this.getMark() <= 79) {
            return "A+";
        } else if (this.getMark() >= 60 && this.getMark() <= 69) {
            return "A-";
        } else if (this.getMark() >= 50 && this.getMark() <= 59) {
            return "B";
        } else if (this.getMark() >= 40 && this.getMark() <= 49) {
            return "C";
        } else if (this.getMark() >= 34 && this.getMark() <= 39) {
            return "D";
        } else
            return "Fail";
    }

    public String toString() {
        return "Student Name: " + name + "\nID: " + id + "\nResult: " + result + "\n";
    }

    // add a student
    public static void addStudent(Student[] students) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = s.nextLine();
        System.out.println("Enter student ID: ");
        String id = s.nextLine();
        System.out.println("Enter student mark: ");
        int mark = s.nextInt();
        Student[] temp = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            temp[i] = students[i];
        }
        temp[students.length] = new Student(name, id, mark);
        students = temp;
        System.out.println("Student added successfully");
        s.nextLine();
        s.nextLine();
        s.nextLine();
        s.close();
    }

    // vidw all students
    public static void viewAllStudents(Student[] students) {
        if(students.length == 0){
            System.out.println("No students in the list");
        }
        else{
            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i]);
            }
        }
        Scanner s = new Scanner(System.in);
        s.next();
        s.close();
    }

    // view a student
    public static void viewStudent(Student[] students) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter student ID: ");
        String id = s.nextLine();
        for (int i = 0; i < students.length; i++) {
            if (students[i].id.equals(id)) {
                System.out.println(students[i]);
            }
            else System.out.println("Student not found");
        }
        s.next();
        s.close();
    }
    
    // sort via marks
    public static void sortViaMark(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                if (students[j].getMark() > students[j + 1].getMark()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
    
    // sort via name
    public static void sortViaName(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.size() - 1; j++) {
                if (students.get(j).name.compareTo(students.get(j + 1).name) > 0) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
    }

    // sort via id
    public static void sortViaID(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.size() - 1; j++) {
                if (students.get(j).id.compareTo(students.get(j + 1).id) > 0) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
    }

}
