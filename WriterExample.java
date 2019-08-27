import java.io.Writer;
import java.io.FileWriter;
import java.io.IOException;
public class WriterExample {
		public static void main(String [] ags)
		{
			try
			{
				Writer w = new FileWriter("d:/data.txt");
				String content = "She Sells Sea Shells In the Sea";
				w.write(content);
				w.close();
				System.out.println("Data Written");
			}
			catch(IOException e)
			{
			e.printStackTrace();
		}
}
}
