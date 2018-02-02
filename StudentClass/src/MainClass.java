import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
       Student[] students = new Student[10];
       String names;
       String specifity;
       int age, course;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the info about students");
       for(int i = 0; i<5; i++){
           System.out.println("Enter age:");
           age = scanner.nextInt();
           System.out.println("Enter course");
           course = scanner.nextInt();
           System.out.println("Enter name");
           names = scanner.next();
           System.out.println("Enter specifity");
           specifity = scanner.next();
           students[i] = new Student(age, names, course, specifity);
       }

       bubbleSort(students,5);
       for(int i = 0; i<5; i++){
           System.out.println("name: " + students[i].name + " " +
                   "age: " + students[i].age + " "  +
                   "specifity: " + students[i].specifity+ " " +
                   "course: " + students[i].course
           );

           System.out.println();
       }

    }

    static void bubbleSort(Student[] stud, int size) {
        int i, j;
        Student tmp;
        for (i = 1; i < size; i++) {
            for (j = 1; j < size; j++) {
                if (stud[j].age > stud[j-1].age) {
                    tmp = stud[j];
                    stud[j] = stud[j-1];
                    stud[j-1] = tmp;
                }
            }
        }
    }
}
