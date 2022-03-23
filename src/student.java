import java.util.*;
public class student {
    public String name;
    public String id;
    private int mark;
    public String result;
    public student(String name, String id, int mark){
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
    public String returnResult(int mark){
        if (this.getMark() >=80 && this.getMark() <=100){
            return "A+";
        }
        else if (this.getMark() >=70 && this.getMark() <=79){
            return "A+";
        }
        else if (this.getMark() >=60 && this.getMark() <=69){
            return "A-";
        }
        else if (this.getMark() >=50 && this.getMark() <=59){
            return "B";
        }
        else if (this.getMark() >=40 && this.getMark() <=49){
            return "C";
        }
        else if (this.getMark() >=34 && this.getMark() <=39){
            return "D";
        }
        else return "Fail";
    }

    public String toString(){
        return "Student Name: " + name + "ID: " + id + "Result: " + result ;
    }

    //sort via marks
    public static void sortViaMark(student[] students){
        for (int i = 0; i < students.length; i++){
            for (int j = 0; j < students.length - 1; j++){
                if (students[j].getMark() > students[j+1].getMark()){
                    student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }
    //sort via name
    public static void sortViaName(student[] students){
        for (int i = 0; i < students.length; i++){
            for (int j = 0; j < students.length - 1; j++){
                if (students[j].name.compareTo(students[j+1].name) > 0){
                    student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }
    //sort via id
    public static void sortViaID(student[] students){
        for (int i = 0; i < students.length; i++){
            for (int j = 0; j < students.length - 1; j++){
                if (students[j].id.compareTo(students[j+1].id) > 0){
                    student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }

    //vidw all students
    public static void viewAllStudents(student[] students){
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
    }

    //view a student
    public static void viewStudent(student[] students){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter student ID: ");
        String id = s.nextLine();
        for (int i = 0; i < students.length; i++){
            if (students[i].id.equals(id)){
                System.out.println(students[i]);
            }
        }
    }

    //add a student
    public static void addStudent(student[] students){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = s.nextLine();
        System.out.println("Enter student ID: ");
        String id = s.nextLine();
        System.out.println("Enter student mark: ");
        int mark = s.nextInt();
        student[] temp = new student[students.length + 1];
        for (int i = 0; i < students.length; i++){
            temp[i] = students[i];
        }
        temp[students.length] = new student(name, id, mark);
        students = temp;
    }
    


    
}
