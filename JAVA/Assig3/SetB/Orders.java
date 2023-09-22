import java.util.Scanner;
abstract class order
{
     int ID,ID1;
     String name,des,name1,des1;
}
class purchase extends order
{
       voID display(int ID,String name,String des)
       {
            System.out.print("\n\n");
            System.out.println("\nID of the Buyer: "+ID);
            System.out.println("\nName of the Buyer : "+name);    
            System.out.println("\nDescription: "+des);
       }  
       voID input()
       {
             
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter ID of the Buyer : ");
             ID=sc.nextInt(); 
             System.out.println("enter name of the Buyer : ");
             String name=sc.next(); 
             System.out.println("enter description  : ");
             String des=sc.next();  
             display(ID,name,des);
  
       }
 }
 class sales extends order
{
       
       voID dp(int ID1,String name1,String des1)
       {
            System.out.println("\nID of Seller : "+ID1);
            System.out.println("\nName of Seller : "+name1);    
            System.out.println("\nDescription: "+des1);
       }  
       voID ip()
       { 
             Scanner sc=new Scanner(System.in);
             System.out.println("enter ID of Seller  : ");
             ID1=sc.nextInt(); 
             System.out.println("enter name of Seller: ");
             String name1=sc.next(); 
             System.out.println("enter description  : ");
             String des1=sc.next();  
             dp(ID1,name1,des1);      
       }
 }
 class Orders
{
       public static voID main(String args[])
       {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the no. of orders");
              int n=sc.nextInt();    	
              sales o1[]=new sales[n];
              purchase o[]=new purchase[n];
     	      for (int j=0;j<n;j++){
     	      		o1[j]=new sales();
                 	o[j]=new purchase();
                 	o[j].input();
                 	System.out.print("\n");
                 	o1[j].ip();
              }

	}
}
