import java.io.*;
import java.util.*;

class File1{
	public static void main(String args[]) throws IOException{
		FileReader f = new FileReader("sample.txt");
		Scanner sc = new Scanner(f);
		String CH, CH1;
		while(sc.hasNext()){
			StringBuilder C1 = new StringBuilder();
			CH=sc.next();
			
			CH1=CH.toUpperCase();
			C1.append(CH1);
			C1.reverse();
			System.out.println(C1);
		}
		f.close();
	}
}
