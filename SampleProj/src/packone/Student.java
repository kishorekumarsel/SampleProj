package packone;

import java.util.Scanner;

public class Student {	
	int a; int b; int c;	
	Student(int m1, int m2){
		a=m1; b=m2;	}
	Student(int m1, int m2, int c){
		a=m1; b=m2; this.c=c;	}
	
	public void total() {System.out.println(a+b);}
	public void percentage() {System.out.println((a+b)/2);}
	public void total1() {System.out.println(a+b+c);}
	public void percentage1() {System.out.println((a+b+c)/3);}
	
	public static void main(String[] args) {
		
		int i;
		for(i=1; i<6; i++) {
			
			System.out.println("Enter Marks1");
			Scanner s=new Scanner(System.in);
			int a1=s.nextInt();
			System.out.println("Enter Marks2");
			int b1=s.nextInt();	
		
		Student s1=new Student(a1, b1);
		s1.total();s1.percentage();		
		}
		
		
		
		
		
		
	}
	

}
