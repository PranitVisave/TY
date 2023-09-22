import java.util.*;
import java.io.*;

class continent{
	String Cname;
	continent(String Cname){
		this.Cname=Cname;
	}
	void displayContinent(){
		System.out.println("\nContinent : "+Cname);
	}
}

class Country extends continent{
	String countryName;
	Country(String Cname,String countryName){
		super(Cname);
		this.countryName=countryName;
	}
	void displayCountry(){
		displayContinent();
		System.out.println("\nCountry : "+countryName);
	}
}
class State extends Country{
	String sname,place;
	State(String Cname,String countryName,String sname,String place){
		super(Cname,countryName);
		this.sname=sname;
		this.place=place;
	}
	void displayState(){
		displayCountry();
		System.out.println("\nState : "+sname);
		System.out.println("\nPlace : "+place);
	}
}
class Continents{
	public static void main(String args[]){
		State loc = new State("Asia","Bharat","Maharashtra","Nashik");
		loc.displayState();
	}
}
