import java.util.*;
public class SwitchCase{
	public static void main(String args[]){
		int op=1,r,h,fact=1,num,digit;
		float PI = 3.14f,v;
		Scanner sc = new Scanner(System.in);
		while (op>=1 && op<=4){
			System.out.println("Operations :");
			System.out.println("1. Calculate volume of cylinder ");
			System.out.println("2. Find factorial");
			System.out.println("3. Check if number is Armstrong or not ");
			System.out.println("4. Exit");
			op=sc.nextInt();
			switch (op){
				case 1:
					System.out.println("Enter Height and Radius of Cylinder : ");
					h=sc.nextInt();
					r=sc.nextInt();
					v=PI*r*r*h;
					System.out.println("Volume of Cylinder : "+v+"Unit cubes");
					break;
				case 2:
					System.out.println("Enter Number to find factorial : ");
					num=sc.nextInt();
					for (int i=1;i<=num;i++){
						fact=fact*i;
					}
					System.out.println("Factorial is "+fact);
					break;
				case 3:
					System.out.println("Enter number : ");
					num=sc.nextInt();
					int num1=num;
					int sum=0;
					while (num1!= 0){
						digit=num1%10;
						sum=sum+(digit*digit*digit);
						num1/=10;
					}
					if (num==sum)
						System.out.println("Number is armstrong");
					else
						System.out.println("Number is not armstrong");
					break;
				case 4:
					System.exit(0);
			}
		}
	}
}
								
