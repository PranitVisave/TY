import java.util.*;
import java.text.*;
class q2{
    	String username,password;
    	q2(){
    		username="Pranit";
        	password="12345";
    	}
    	q2(String user,String pass){
    	    username=user;
    	    password=pass;
    	}
    	public static void main(String[] args) {
        	String user,pass;
        	int p=-1,u=-1;
        	q2 obj=new q2();
        	Scanner sc= new Scanner(System.in);
        	System.out.println("Enter username: ");
        	user=sc.next();
        	System.out.println("\nEnter password: ");
        	pass=sc.next();
        	q2 obj1=new q2(user,pass);
        	if((obj.username).equals(obj1.username)){
            		u=1;
            		if (obj.password.equals(obj1.password))        
                		p=1;      
            		else      
                		p=0;    
        	}
        	else 
            		u=0;  
        	if(u==0){
                	try{
                        	throw new NullPointerException();
                	}
                    	catch (Exception e){
                        	System.out.println("exception in thread ‘main’ InvaliduserNameException: Username: "+ user+ " doesn’t match")  ;
                    	}
        	}
        	if (p==0){        
        		try{
        	        	throw new NullPointerException();
               		}
                	catch (Exception e){
                        	System.out.println("exception in thread ‘main’ InvalidPasswordException: Password: "+ pass+ " doesn’t match")  ;
                	}
        	}
	}
}

