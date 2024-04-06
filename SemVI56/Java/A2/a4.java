import java.util.*;
class b1 implements Runnable{
	Thread t;
	int i,no,sum;
	int a[] = new int[100];
	thread(String s,int n){
		Random rs = new Random();
		t=new Thread(this.s);
		no=n;
		int j=0;
		for (i=1;i<100;i++){
			a[j]=rs.nextInt()%100;
			j++;
		}
		t.start();
		public void run(){
			System.out.println("Elements are 1 to 100\n");
			for (int i=1;i<=100;i++){
				sum+=a[no];
				no++;
			}
			int k=0;
			for (int i=1;i<=100;i++){
				System.out.println("Sum = "+sum);
				System.out.println("Avg = "+sum/100);
			}
		}
	}
	public static void main(String args[]){
		b1 t1 = new b1("g",100);
		t1.t.join();
		b1 t2 = new b1("g",100);
		t2.t.join();
		b1 t3 = new b1("g",100);
		t3.t.join();
		b1 t4 = new b1("g",100);
		t4.t.join();
		b1 t5 = new b1("g",100);
		t5.t.join();
		b1 t6 = new b1("g",100);
		t6.t.join();
		b1 t7 = new b1("g",100);
		t7.t.join();
		b1 t8 = new b1("g",100);
		t8.t.join();
		b1 t9 = new b1("g",100);
		t9.t.join();
		b1 t10 = new b1("g",100);
		t10.t.join();
	}
}
