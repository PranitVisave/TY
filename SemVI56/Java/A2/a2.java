import java.io.*;
class a2 extends Thread{
	public void run(){
		for (int i=100;i>=1;i--){
			try{
				Thread.sleep(10);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println("Thread "+i);
		}
	}
	public static void main(String args[]){
		a2 t1 = new a2();
		t1.start();
	}
}
