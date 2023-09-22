import java.util.*;
public class array{
	public static void main(String args[]){
		int a[],n;
		System.out.println("Enter size of array : ");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		a = new int[n];
		System.out.println("Enter "+n+" Elements in Array : ");
		for (int i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.println("Array in reverse order : ");
		for (int i=n-1;i>=0;i--)
			System.out.print(a[i]+" ");
		}
}
