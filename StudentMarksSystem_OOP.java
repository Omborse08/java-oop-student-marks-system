import java.util.Scanner;

class Student {
    String name;
    int rollno;
    int marks;

    public void ShowPassorFail() {
        if (marks >= 200) {
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
    }

    public void StudentDetails() {
        System.out.print("\n ===== Student Details! =====");
        System.out.printf("\nName: %s",name);
        System.out.printf("\nRoll No: %d",rollno);
        System.out.printf("\nMarks: %d",marks);
        System.out.print("\nGrade: ");
        ShowPassorFail();
    }
}

public class StudentMarksSystem_OOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stud = new Student();
        for (int i=1;i<=10;i++) {
            System.out.print("\nEnter Your Name: ");
            String std_name = sc.next();
            System.out.print("Enter Your Marks Out Of 300: ");
            int std_marks = sc.nextInt();
            if (std_marks>300 || std_marks<0) {
                System.out.print("Invalid Marks\n");
                i--;
                continue;
            }
            stud.name = std_name;
            stud.rollno = i;
            stud.marks = std_marks;
            stud.StudentDetails();
        }
        sc.close();
    }
}