import java.io.*;
public class Cricket
{
	String name;
	public int inning, tofnotout, totalruns;
	public float batavg;
	public Cricket(){
  	name=null;
  	inning=0;
  	tofnotout=0;
  	totalruns=0;
  	batavg=0;
}
	public void get(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name, No of innings, No of times not out, total runs: ");
  	name=sc.next();
  	inning=Integer.parseInt(sc.nextInt());
  	tofnotout=Integer.parseInt(sc.nextInt());
  	totalruns=Integer.parseInt(sc.nextInt());
 }
 	public void put(){
  		System.out.println("Name = "+name);
  		System.out.println("no of innings = "+inning);
  		System.out.println("no times notout = "+tofnotout);
  		System.out.println("total runs = "+totalruns);
  		System.out.println("bat avg = "+batavg);
}
 	static void avg(int n, Cricket c[]){
  		try{
   			for(int i=0;i<n;i++)
    				c[i].batavg=c[i].totalruns/c[i].inning;
 		}
   		System.out.println("Invalid arg");
}
 	static void sort(int n, Cricket c[]){
  		String temp1;
  		int temp2,temp3,temp4;
  		float temp5;
  		for(int i=0;i<n;i++){
   			for(int j=i+1;j<n;j++){
    				if(c[i].batavg<c[j].batavg){
    					temp1=c[i].name;
     					c[i].name=c[j].name;
     					c[j].name=temp1;
     					temp2=c[i].inning;
     					c[i].inning=c[j].inning;
     					c[j].inning=temp2;
     
     					temp3=c[i].tofnotout;
     					c[i].tofnotout=c[j].tofnotout;
     					c[j].tofnotout=temp3;
     
     					temp4=c[i].totalruns;
     					c[i].totalruns=c[j].totalruns;
     					c[j].totalruns=temp4;
     
     					temp5=c[i].batavg;
     					c[i].batavg=c[j].batavg;
     					c[j].batavg=temp5;
    				}
   			}
  		}
 	}


	public static void main(String args[]){
  		Scanner sc = new Scanner(System.in);
  		System.out.println("Enter the limit:");
  		int n=Integer.parseInt(br.readLine());
  		Cricket c[]=new Cricket[n];
  		for(int i=0;i<n;i++){
   			c[i]=new Cricket();
   			c[i].get();
  		}
  		Cricket.avg(n,c);
  		Cricket.sort(n, c);
  		for(int i=0;i<n;i++)
    			c[i].put();
 
 	}
 }




































/*


import java.util.*;
import java.io.*;

class CricketPlayer{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String name;
		int no_inn,no_notout,totalruns,bat_avg;
		System.out.println("Enter Number Of Players : ");
		int n = sc.nextInt();
		int[] a = new a[n];
		for (int i=0;i<n;i++){
			System.out.println("Enter name of Player : ");
			name = sc.next();
			System.out.println("Enter Number of innings : ");
			no_inn = sc.nextInt();
			System.out.println("Enter Number of times player not out : ");
			no_notout = sc.nextInt();
			System.out.println("Enter Total Runs : ");
			totalruns=sc.nextInt();
			
		}
		
}
			
			
			
			*/
