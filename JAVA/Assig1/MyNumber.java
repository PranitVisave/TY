import java.io.*;
import java.util.*;
public class MyNumber{
	private int data;
	MyNumber(){
		data=0;
	}
	MyNumber(int data){
		this.data=data;
	}
	static int isNegative(int data){
		if (data<0)
			return 1;
		return 0;
	}
	static int isPositive(int data){
		if (data>0)
			return 1;
		return 0;
	}
	static int isZero(int data){
		if (data==0)
			return 1;
		return 0;
	}
	static int isOdd(int data){
		if (data%2!=0)
			return 1;
		return 0;
	}
	static int isEven(int data){
		if (data%2==0)
			return 1;
		return 0;
	}
	
	public static void main(String args[]){
		int n,j,k;
		n=Integer.parseInt(args[0]);
		k=isNegative(n);
		if (k==1)
			System.out.println("Number is Negative");
		k=isPositive(n);
		if (k==1){
			System.out.println("Number is Positive");
			j=isOdd(n);
			if (j==1)
				System.out.println("Number is Odd");
			j=isEven(n);
			if (j==1)
				System.out.println("Number is Even");
		}
		k=isZero(n);
		if (k==1)
			System.out.println("Number is Zero");
	}
}
