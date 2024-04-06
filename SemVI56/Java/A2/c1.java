import java.util.*;
import java.lang.String;
class signal extends Thread{
	int s;
	public signal(int s){
		this.s=s;
	}
	public void run(){
		if (s==1)
			System.out.println("Signal Green \nGO\n");
		else if (s==2)
			System.out.println("Signal Yellow \nWAIT\n");
		else if (s==3)
		System.out.println("Signal Red \nSTOP\n");
	}
}
public class c1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : GREEN\n2 : YELLOW\n3 : RED\n");
		int n = sc.nextInt();
		signal s1 = new signal(n);
		s1.start();
	}
}
