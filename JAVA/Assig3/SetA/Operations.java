import java.util.*;
import java.io.*;

interface Operation{
	float PI = 3.14f;
	void area();
	void volume();
}
class cylinder implements Operation{
	float r,h;
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Radius of Cylinder : ");
		r = sc.nextFloat();
		System.out.println("\nEnter Height of Cylinder : ");
		h = sc.nextFloat();
	}
	public void area(){
		float a = 2*PI*r*(r+h);
		System.out.println("\nArea of Cylinder : "+a);
	}
	public void volume(){
		float v = (PI*r*r*h);
		System.out.println("\nVolume of Cylinder : "+v);
	}
}
class Operations{
	public static void main(String args[]){
		cylinder c = new cylinder();
		c.input();
		c.area();
		c.volume();
	}
}
