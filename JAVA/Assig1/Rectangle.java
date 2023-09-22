import java.util.*;
public class Rectangle{
	public static void main(String args[]){
		System.out.println("Enter length and breadth of rectangle : ");
		Scanner sc = new Scanner(System.in);
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		int area=length*breadth;
		int perimeter= 2*(length+breadth);
		System.out.println("Area Of Rectangle is "+area);
		System.out.println("Perimeter Of rectangle is "+perimeter);
		}
}
		
