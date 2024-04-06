import java.util.*;

class b1 implements Runnable {
    Thread t;
    int a[] = new int[1000];
    int no, sum;

    b1(String s, int n) {
        Random r = new Random();
        t = new Thread(this, s);
        int j = 0;
        no = n;
        for (int i = 0; i < 100; i++) {
            a[i] = r.nextInt(100);
            j++;
        }
        t.start();

    }// b1

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(a[no] + " ");
                sum = sum + a[no];
                no++;

            }
            System.out.println("");
            System.out.println("SUM: " + sum);
            System.out.println("AVG: " + sum / 10);
            System.out.println("");
        } // try
        catch (Exception e) {
            e.printStackTrace();
        }

    }// run

}

class B1 {

    public static void main(String arg[]) {
        try {
            b1 t1 = new b1("t1", 1);
            t1.t.join();

            b1 t2 = new b1("t2", 10);
            t2.t.join();

            b1 t3 = new b1("t3", 20);
            t3.t.join();

            b1 t4 = new b1("t4", 30);
            t4.t.join();

            b1 t5 = new b1("t5", 40);
            t5.t.join();

            b1 t6 = new b1("t6", 50);
            t6.t.join();

            b1 t7 = new b1("t7", 60);
            t7.t.join();

            b1 t8 = new b1("t8", 70);
            t8.t.join();

            b1 t9 = new b1("t9", 80);
            t9.t.join();

            b1 t10 = new b1("t10", 90);
            t10.t.join();
        } // try
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}

/*
import java.util.*;
class b1 implements Runnable{
	Thread t;
	int i,no,sum;
	int a[] = new int[100];
	b1(String s,int n){
		Random rs = new Random();
		t=new Thread(this,s);
		no=n;
		int j=0;
		for (i=1;i<100;i++){
			a[j]=rs.nextInt()%100;
			j++;
		}
		t.start();
	}
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

*/
