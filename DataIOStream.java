import java.io.*;
public class DataIOStream {
		 public static void main(String args[])throws IOException{
		 DataInputStream d = new DataInputStream(new FileInputStream("d:/abc/country.txt")); 
		DataOutputStream out = new DataOutputStream(new FileOutputStream("d:/abc/test_country.txt")); 

		String count;
		while((count = d.readLine()) != null){ 
			String u = count.toUpperCase(); 
			System.out.println(u); out.writeBytes(u + " ,"); }
		 	d.close(); 
			out.close();  } }
