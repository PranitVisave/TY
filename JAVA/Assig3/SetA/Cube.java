import java.util.*;
import java.io.*;

interface PrintCube{
	public void print(int num1);
}
public class Cube{
	public static void main(String args[]){
		PrintCube c = n -> System.out.println("\nCube is : "+n*n*n);
		c.print(5);
	}
}
