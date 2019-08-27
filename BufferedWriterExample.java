import java.io.*;
public class BufferedWriterExample {
	public static void main(String[] args) {
		try {
				FileWriter w = new FileWriter("d:/abc/names.txt",true);
				BufferedWriter b = new BufferedWriter(w);
				
				b.write("jamaes");
				b.write("\n");
				b.write("Hobert");
				b.close();
				
				System.out.println("Succesfully written to a file:");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

}
}
