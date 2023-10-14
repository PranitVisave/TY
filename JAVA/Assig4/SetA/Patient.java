import java.io.*;
import java.util.*;

class Patient{
	String pname;
	int age;
	int oxlevel;
	int HRCT;
	
	Patient(String pname,int age,int oxlevel,int HRCT){
		this.pname=pname;
		this.age=age;
		this.oxlevel=oxlevel;
		this.HRCT=HRCT;
	}
	void display()
       	{
            System.out.print("\n\n");
            System.out.println("Name : "+pname);
            System.out.println("Age : "+age);    
            System.out.println("Oxygen Level : "+oxlevel);
            System.out.println("HRCT Report : "+HRCT);
       	}
	public static void main(String args[]){
		int n,age,ox,HRCT,i;
		String pname;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Number Of Patients : ");
		n=sc.nextInt();
		Patient[] ob = new Patient[n];
		for (i=0;i<n;i++){
			System.out.println("\nEnter Name of Patient : ");
			pname=sc.next();
			System.out.println("\nEnter age : ");
			age=sc.nextInt();
			System.out.println("\nEnter Oxygen Level : ");
			ox=sc.nextInt();
			System.out.println("\nEnter HRCT : ");
			HRCT=sc.nextInt();
			ob[i]=new Patient(pname,age,ox,HRCT);
	 	}
	 	System.out.println("\nDetails Of Patients :\n");
	 	for (i=0;i<n;i++){
	 		if (ob[i].oxlevel<95 && ob[i].HRCT > 10){
	 			try{
	 				throw new NullPointerException();
	 			}
	 			catch(Exception e){
	 				System.out.println("\nPatient "+ob[i].pname+" Needs to be Hosptitalised ");
	 			}
	 		}
	 		else{
	 			ob[i].display();
	 		}
	 	}
	 }
}
