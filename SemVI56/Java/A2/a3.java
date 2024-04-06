import java.io.*;
import java.util.*;
class producer extends Thread{
	List list;
	int size;
	public producer(List list,int size){
		this.list=list;
		this.size=size;
	}
	public void run(){
		try{
			synchronized(list){
				while(true){
					if (list.size()==size)
						list.wait();
					else{
						for (int i=1;i<=size;i++){
							Thread.sleep(1);
							list.add(i);
							System.out.println("Added Element : "+i);
							list.notify();
						}
					}
				}
			}
		}catch(InterruptedException e){
		}
	}
}
class consumer extends Thread{
	List list;
	int size;
	public consumer(List list,int size){
		this.list=list;
		this.size=size;
	}
	public void run(){
		try{
			synchronized(list){
				while(true){
					if (list.size()==0)
						list.wait();
					else{
						consume();
					}
				}
			}
		}
		catch(InterruptedException e){}
	}

	public void consume() throws InterruptedException{
		while(!list.isEmpty()){
			Thread.sleep(100);
				System.out.println("Removed Element : "+list.remove(0));
			}
		System.exit(0);
	}
}
class a3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List list = new ArrayList();
		System.out.println("Enter Buffer Size : ");
		int n = sc.nextInt();
		producer p = new producer(list,n);
		consumer c = new consumer(list,n);
		p.start();
		c.start();
	}
}
