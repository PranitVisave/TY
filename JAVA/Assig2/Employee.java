import java.io.*;
import java.util.*;
class Employee{
	static int id;
	static String name;
	static String dept;
	static int sal;
	static int objcnt=0;
	Employee(){
		this.id=0;
		this.name=null;
		this.dept=null;
		this.sal=0;
		objcnt++;
	}
	Employee(int id, String name, String dept, int sal){
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
		objcnt++;
	}
	void display(){
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Dept : "+dept);
		System.out.println("Salary : "+sal);
		System.out.println("Object Count : "+objcnt);
	}
	public static void main(String args[]){
		int i;
		int n=Integer.parseInt(args[0]);
		Employee a[]= new Employee[n];
		Scanner sc = new Scanner(System.in);
		for (i=0;i<n;i++){
			System.out.println("Enter ID : ");
			id=sc.nextInt();
			System.out.println("Enter Name : ");
			name=sc.next();
			System.out.println("Enter Department : ");
			dept=sc.next();	
			System.out.println("Enter Salary : ");
			sal=sc.nextInt();
			a[i] = new Employee(id,name,dept,sal);
			a[i].display();
		}
		
	}
}
				
		
		
		
		
		
		
		
		
