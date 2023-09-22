import java.io.*;
import java.util.*;
class MyNumber{
	private int data;
	MyNumber(){
		data=0;
	}
	MyNumber(int data){
		this.data=data;
	}
	int isNegative(int data){
		if (data<0)
			return 1;
		return 0;
	}
	int isPositive(int data){
		if (data>0)
			return 1;
		return 0;
	}
	int isZero(int data){
		if (data==0)
			return 0;
		return 1;
	}
	int isOdd(int data){
		if (data%2!=0)
			return 1;
		return 0;
	}
	int isEven(int data){
		if (data%2==0)
			return 1;
		return 0;
	}
	
	public static void main(String args[]){
		int n,j,k;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
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
