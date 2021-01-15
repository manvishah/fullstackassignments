//13 jan 2021
import java.util.Scanner;

public class Assignmentone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int count=0;
		int dcount=0;
		int e=0,h=0,m=0;
		do {
			System.out.println("which test you want to give?");
			System.out.println(" ");
			System.out.println("1)English 2)Maths 3)History");
			System.out.println(" ");
			Scanner sc=new Scanner(System.in);
			i=sc.nextInt();
			int j;
			switch(i)
			{
			
			case 1:
				
				 if(e==1) {
					 System.out.println("You have completed this test do try another one");
					 break;
				 }
				System.out.println("English test");
				System.out.println("solve the mcqs");
				System.out.println(" ");
				
				
				System.out.println("1)I ..... tennis every Sunday morning. ");
				System.out.println("	1.playing\r\n"
						+ "	2.play\r\n"
						+ "	3.am playing\r\n"
						+ "	4.am play\r\n"
						+ "");
				
				System.out.println("enter your answer as 1,2,3 or 4");
				System.out.println(" ");
				j=sc.nextInt();
				if(j==2) {
					System.out.println("answer is right");
					count = count+10;
				}else {
					System.out.println("answer is wrong");
					dcount = dcount+10;
				}
				
				System.out.println(" ");
				System.out.println("2)Sorry, she can't come to the phone. She ....... a breakfast!");
				System.out.println("	1.is having\r\n"
						+ "	2.having\r\n"
						+ "	3.have\r\n"
						+ "	4.has\r\n"
						+ "");
				
				System.out.println("enter your answer as 1,2,3 or 4");
				System.out.println(" ");
				j=sc.nextInt();
				if(j==1) {
					System.out.println("answer is right");
					count = count+10;
				}else {
					System.out.println("answer is wrong");
					dcount = dcount+10;
				}
				
				System.out.println(" ");
				System.out.println("3)Babies ..... when they are hungry.");
				System.out.println("	1.cry\r\n"
						+ "	2.cries\r\n"
						+ "	3.cried\r\n"
						+ "	4.crying\r\n"
						+ "");
				
				System.out.println("enter your answer as 1,2,3 or 4");
				System.out.println(" ");
				j=sc.nextInt();
				if(j==2) {
					System.out.println("answer is right");
					count = count+10;
				}else {
					System.out.println("answer is wrong");
					dcount = dcount+10;
				}
			
				e=1;
				break;
			
				
				
		case 2:
			
			
			 if(m==1) {
				 System.out.println("You have completed this test do try another one");
				 break;
			 }
			 System.out.println(" ");
			System.out.println("Maths test");
			System.out.println("solve the mcqs");
			
			System.out.println(" ");
			System.out.println("1) 5+5 ");
			System.out.println("	1. 10"
					+ "	2. 9\r\n"
					+ "	3. 8\r\n"
					+ "	4. 11\r\n"
					+ "");
			
			System.out.println("enter your answer as 1,2,3 or 4");
			j=sc.nextInt();
			System.out.println(" ");
			if(j==1) {
				System.out.println("answer is right");
				count = count+10;
			}else {
				System.out.println("answer is wrong");
				dcount = dcount+10;
			}
			
			System.out.println(" ");
			System.out.println("2) 41*2");
			System.out.println("	1. 62\r\n"
					+ "	2. 82\r\n"
					+ "	3. 86\r\n"
					+ "	4. 84\r\n"
					+ "");
			
			System.out.println("enter your answer as 1,2,3 or 4");
			j=sc.nextInt();
			System.out.println(" ");
			if(j==2) {
				System.out.println("answer is right");
				count = count+10;
			}else {
				System.out.println("answer is wrong");
				dcount = dcount+10;
			}
			
			System.out.println(" ");
			System.out.println("3) 117-89");
			System.out.println("	1. 29\r\n"
					+ "	2. 28\r\n"
					+ "	3. 27\r\n"
					+ "	4. 26\r\n"
					+ "");
			
			System.out.println("enter your answer as 1,2,3 or 4");
			j=sc.nextInt();
			System.out.println(" ");
			if(j==2) {
				System.out.println("answer is right");
				count = count+10;
			}else {
				System.out.println("answer is wrong");
				dcount = dcount+10;
			}
			
			m=1;
			break;
			
			
			
		case 3:
			
			
			 if(h==1) {
				 System.out.println("You have completed this test do try another one");
				 break;
			 }
			System.out.println("History test");
			System.out.println("solve the mcqs");
			System.out.println(" ");
			
			System.out.println("1)Arabs were defeated in 738 A.D. by…. ");
			System.out.println("	1.pratiharas\r\n"
					+ "	2.rashtrakutas\r\n"
					+ "	3.palas\r\n"
					+ "	4.chalukyas\r\n"
					+ "");
			
			System.out.println("enter your answer as 1,2,3 or 4");
			j=sc.nextInt();
			System.out.println(" ");
			if(j==4) {
				System.out.println("answer is right");
				count = count+10;
			}else {
				System.out.println("answer is wrong");
				dcount = dcount+10;
			}
			
			System.out.println(" ");
			System.out.println("2)Where did Rigvedic Aryans live in India?");
			System.out.println("	1. Northern India\r\n"
					+ "	2. Eastern India\r\n"
					+ "	3. All over India\r\n"
					+ "	4. Sapta Sindhu area\r\n"
					+ "");
			
			System.out.println("enter your answer as 1,2,3 or 4");
			j=sc.nextInt();
			System.out.println(" ");
			if(j==4) {
				System.out.println("answer is right");
				count = count+10;
			}else {
				System.out.println("answer is wrong");
				dcount = dcount+10;
			}
			
			System.out.println(" ");
			System.out.println("3) Mahatma Gandhi was first arrested during ' Satyagraha' in the year –");
			System.out.println("	1.1922\r\n"
					+ "	2.1912\r\n"
					+ "	3.1909\r\n"
					+ "	4.1908\r\n"
					+ "");
			
			System.out.println("enter your answer as 1,2,3 or 4");
			j=sc.nextInt();
			System.out.println(" ");
			if(j==4) {
				System.out.println("answer is right");
				count = count+10;
			}else {
				System.out.println("answer is wrong");
				dcount = dcount+10;
			}
		   h=1;
		   break;
		
			default:
				System.out.println("please enter valid subject number");
				
			}
			
			System.out.println("Do you want to continue? if yes press 10 else 11");
			System.out.println(" ");
			int yn=sc.nextInt();
			System.out.println(" ");
					if(yn==10) {
						
					}else {
						break;
					}
			
		}while(i<=10);
		
		
		if(count>=70) {
			int res=count+10;
			System.out.println("overall you scored "+count);
			if(res >=90) {
				System.out.println("congratulations you scored "+res+" % you are selected");
			}
		}else {
			System.out.println("You scored "+count);
			System.out.println("Better luck next time");
		}
		
	

	}

}
