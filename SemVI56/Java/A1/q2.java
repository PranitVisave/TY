import java.util.*;
import java.io.*;
public class q2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. Of Friends : ");
		int n = sc.nextInt();
		LinkedList a = new LinkedList<>();
		System.out.println("Enter name of Friends : ");
		for (int i=0;i<n;i++)
			a.add(sc.next());
		System.out.println("My Friends : ");
		for (int i=0;i<a.size();i++)
			System.out.println(a.get(i));
	}
}
