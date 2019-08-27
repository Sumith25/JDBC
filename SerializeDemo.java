import java.io.*;
public class SerializeDemo {
	
	public static void main(String [] args)
	{
		Employee e = new Employee();
		e.name = "Micheal Jackson";
		e.address = "Castle Street,Banglore";
		e.SSN =1112233;
		e.number = 101;
		
		try
		{
			FileOutputStream fileout = new FileOutputStream("d:/abc/employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			out.writeObject(e);
			out.close();
			System.out.println("Serialized data is Saved in d:/abc/employee.ser");
			
		}
		catch(Exception i)
		{
			i.printStackTrace();
		}
	}

}
