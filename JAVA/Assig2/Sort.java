import java.io.*;
import java. util.*;
class Sort{
	public static void main(String args[]){
		int a[] = new int[args.length];
		for (int j=0;j<args.length;j++)
			a[j]=Integer.parseInt(args[j]);
		for (int i=0;i<args.length-1;i++)
			for (int j=i+1;j<args.length;j++)
				if (a[i] < a[j]){
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
		System.out.println("Sorted Array : ");
		for (int i=0;i<args.length;i++)
			System.out.println(a[i]);
	}
}
