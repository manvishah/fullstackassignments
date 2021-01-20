import java.util.Scanner;

class Student{
	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	int age;
	int marks[]=new int[4];
	char avg;
	void read() {
		System.out.println("Id of student ");
		id=sc.nextInt();
		System.out.println("Name of student is ");
		name=sc.next();
		System.out.println("age of student is ");
		age=sc.nextInt();
		System.out.println("age is "+age);
		System.out.println("Marks for pcmb are ");
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
		}
	}
	void calgrade() {
		int total=(marks[0]+marks[1]+marks[2]+marks[3])/4;
		
		if(total>90) {
			System.out.println("you got A+");
			avg='A';
		}
		else if(total > 80) {
			System.out.println("you got A");
			avg='A';
		}
		else if(total >70) {
			System.out.println("you got B");
			avg='B';
		}
		else if(total > 55) {
			System.out.println("you got C");
			avg='C';
		}
		else {
			System.out.println("you got D");
			avg='D';
		}
		
	}
	void display() {
		System.out.println("Id of student is "+id);
		System.out.println("Age of student is "+age);
		System.out.println("Name of student is "+name);
		System.out.println("Grade of student is "+avg);
		
	}
}
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many students details you want to enter");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		Student std[]=new Student[n];
		for(int i=0;i<n;i++) {
			std[i]=new Student();
			std[i].read();
}
		for(int i=0;i<n;i++){
			std[i].calgrade();
}
		for(int i=0;i<n;i++){
			std[i].display();
}


	}

}
