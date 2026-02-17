import java.util.Scanner;
class Student{
	String name;
	int rollNo;
	int marks;

	void checkEligibility(){
		if (marks >= 40)
			System.out.println(name +"Roll Number is" +rollNo+ " is Eligible for exam");
		else
			System.out.println(name +"Roll Number is "+rollNo + "is Not eligible for exam");
	}
}

	public class eligible{
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		
                Student s1 = new Student();
                Student s2 = new Student();
                Student s3 = new Student();

		System.out.println("Enter the details of student 1");
		System.out.println("Enter the name:");
		s1.name = sc.next();
                System.out.println("Enter the Roll number:");
		s1.rollNo = sc.nextInt();
		System.out.println("Enter the marks:");
		s1.marks = sc.nextInt();

                System.out.println("Enter the details of student 2");
                System.out.println("Enter the name:");
                s2.name = sc.next();
                System.out.println("Enter the Roll number:");
                s2.rollNo = sc.nextInt();
                System.out.println("Enter the marks:");
                s2.marks = sc.nextInt();
	
                System.out.println("Enter the details of student 3");
                System.out.println("Enter the name:");
                s3.name = sc.next();
                System.out.println("Enter the Roll number:");
                s3.rollNo = sc.nextInt();
                System.out.println("Enter the marks:");
                s3.marks = sc.nextInt();


		s1.checkEligibility();
	        s2.checkEligibility();
		s3.checkEligibility();
	}
}
