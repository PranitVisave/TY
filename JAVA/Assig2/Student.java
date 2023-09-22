import java.io.*;
import java.util.*;
class Student{
	static int rno;
	static String name;
	static float perc;
	Student(){
		this.rno=0;
		this.name=null;
		this.perc=0.0f;
	}
	Student(int rno, String name,float sal){
		this.rno=rno;
		this.name=name;
		this.perc=perc;
	}
	void display(){
		System.out.println("Roll No.: "+rno);
		System.out.println("Name : "+name);
		System.out.println("Percentage : "+perc);
	}
	public static void main(String args[]){
		int j,i;
		float t;
		int n=Integer.parseInt(args[0]);
		float perc[] = new float[n];
		Student a[] = new Student[n];
		Scanner sc = new Scanner(System.in);
		for (i=0;i<n;i++){
			System.out.println("Enter Roll No. ");
			rno=sc.nextInt();
			System.out.println("Enter Name : ");
			name=sc.next();
			System.out.println("Enter Percentage : ");
			perc[i]=sc.nextFloat();
			a[i] = new Student(rno,name,perc[i]);
			a[i].display();
		}
			for (i=0;i<n-1;i++)
				for (j=i+1;j<n;j++)
					if (perc[i]<perc[j]){
						t=perc[i];
						perc[i]=perc[j];
						perc[j]=t;
					}
			System.out.println("Sorted Array :\n");
			for (i=0;i<n;i++)
				System.out.println("\t"+perc[i]);
	}			
}

				
		
		
		
		
		
		
		
		
