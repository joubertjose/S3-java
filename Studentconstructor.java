package javalabes;
import java.util.Scanner;
class Student{
	int rollNumber;
	String name;
	int m1,m2,m3;
	float avg;
	Student (String name, int rollNumber,int m1,int m2, int m3){
		this.name=name;
		this.rollNumber=rollNumber;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}

public float calculateAverage(){
	return (m1+m2+m3)/3;
	
}
public void displayDetails(){
	System.out.println("Name:" +name);
	System.out.println("Roll Number:" +rollNumber);
	System.out.println("First Mark: "+m1);
	System.out.println("Second Mark: "+m2);
	System.out.println("Third Mark: "+m3);
	System.out.println("Average Mark: "+calculateAverage());


}
}

public class Studentconstructor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student1=new Student("Nikhil",32,34,56,76);
		Student student2=new Student("Alan",36,38,52,78);
		 System.out.print("Enter Name: ");
	        String name1 = sc.nextLine();
	        System.out.print("Enter Roll Number: ");
	        int rollno = sc.nextInt();
	        System.out.print("Enter Mark 1: ");
	        int mark1 = sc.nextInt();
	        System.out.print("Enter Mark 2: ");
	        int mark2 = sc.nextInt();
	        System.out.print("Enter Mark 3: ");
	        int mark3 = sc.nextInt();
		Student student3=new Student(name1,rollno,mark1,mark2,mark3);
		student1.displayDetails();
		student2.displayDetails();
		student3.displayDetails();

	}


}
