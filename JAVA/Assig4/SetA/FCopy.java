import java.io.*;
import java.util.*;

class FCopy{
	public static void main(String args[]) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter Source File : ");
		String f1 = sc.next();
		
		System.out.println("\nEnter New File Name : ");
		String f2 = sc.next();
		
		FileReader fin = new FileReader(f1);
		FileWriter fout = new FileWriter(f2,true);
		int c;
		while((c=fin.read())!=-1){
			fout.write(c);
		}
		System.out.println("\nCopied!\n");
		fin.close();
		fout.close();
	}
}
