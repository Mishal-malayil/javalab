import java.util.Scanner;

// Student class
class Student {
    int roll;
    int academicScore;

    void getStudentData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        roll = sc.nextInt();

        System.out.print("Enter Academic Score: ");
        academicScore = sc.nextInt();
    }
}

// Sports interface
interface Sports {
    int sportsScore = 0;

    void getSportsScore();
}

// Result class inheriting Student and Sports
class Result extends Student implements Sports {

    int sportScore;

    public void getSportsScore() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sports Score: ");
        sportScore = sc.nextInt();
    }

    void display() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Roll Number: " + roll);
        System.out.println("Academic Score: " + academicScore);
        System.out.println("Sports Score: " + sportScore);
    }
}

// Main class
public class Program13 {
    public static void main(String[] args) {

        Result r = new Result();

        r.getStudentData();
        r.getSportsScore();
        r.display();
    }
}