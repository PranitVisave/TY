import java.io.*;
import java.util.*;
class Name{
	public static void main(String args[]){
		String fname, mname,lname;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name : ");
		fname=sc.next();
		System.out.println("Enter Middle Name : ");
		mname=sc.next();
		System.out.println("Enter Last Name : ");
		lname=sc.next();
		int len = mname.length();
		String f1 = mname.substring(0,1);
		String l1 = mname.substring(1,len);
		f1=f1.toUpperCase();
		mname=f1+l1;
		System.out.println("Updated String : ");
		System.out.println("\nLast Name : "+lname+"\nFirst Name : "+fname+"\nMiddle Name : "+mname);
	}
}
