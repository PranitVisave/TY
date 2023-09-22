import SY.SyMarks;
import TY.TyMarks;
import java.util.*;
import java.io.*;

public class Students{
	private int rno;
	private String name;
	private SyMarks sy;
	private TyMarks ty;
	public int totalMarks;
	Students(int rno,String name,SyMarks sy,TyMarks ty){
		this.rno=rno;
		this.name=name;
		this.sy=sy;
		this.ty=ty;
	}
	public int calculateTotal(){
		int syTotal = sy.getct() + sy.getmt() + sy.getet();
		int tyTotal = ty.getTt() + ty.getPt();
		return syTotal + tyTotal;
	}
	public char calculateGrade(){
		int totalMarks = calculateTotal();
		
		double perc = calculateTotal();
		if (perc >= 70)
			return 'A';
		else if (perc >= 60)
			return 'B';
		else if (perc >= 50)
			return 'C';
		else if (perc >= 40)
			return 'P';
		else
			return 'F';
	}
	
	public void DisplayResult(){
		char c = calculateGrade();
		int t = calculateTotal();
		System.out.println("Roll No. : "+rno);
		System.out.println("Name : "+name);
		System.out.println("Total Marks : "+t);
		System.out.println("Percentage : "+(((double)calculateTotal()/500)*100));
		System.out.println("Grade : "+c);
	}
	
	public static void main(String args[]){
		int rno,ct,et,mt,tm,pm;
		String name;
		double perc;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Students : ");
		int n = sc.nextInt();
		for (int i=0;i<n;i++){
			System.out.println("Enter Roll Number Of Student: ");
			rno = sc.nextInt();
			System.out.println("Enter Name Of Student : ");
			name = sc.next();
			System.out.println("Enter SY Computer Total : ");
			ct = sc.nextInt();
			System.out.println("Enter SY Math Total : ");
			mt = sc.nextInt();
			System.out.println("Enter SY Electronics Total : ");
			et = sc.nextInt();
			System.out.println("Enter TY Theory total : ");
			tm = sc.nextInt();
			System.out.println("Enter TY Practicals total : ");
			pm = sc.nextInt();
			
			SyMarks sy = new SyMarks(ct,mt,et);
			TyMarks ty = new TyMarks(tm,pm);
			Students s = new Students(rno,name,sy,ty);
			s.DisplayResult();
		}
			
	}
}
