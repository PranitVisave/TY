import java.io.*;
class thread extends Thread{
	String msg=null;
	int n;
	thread(String msg,int n){
		this.msg=msg;
		this.n=n;
	}
	public void run(){
		for (int i=0;i<n;i++)
			System.out.println(msg+""+i+"times\n");
		System.out.println();
	}
	public static void main(String args[]){
		int n=10;
		thread t1= new thread("Covid ",n);
		t1.start();
		thread t2= new thread("Lockdown ",n+10);
		t2.start();
		thread t3= new thread("Vaccine",n+20);
		t3.start();
	}
}
