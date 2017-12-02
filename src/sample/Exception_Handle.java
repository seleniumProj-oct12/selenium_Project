package sample;

import java.io.IOException;
import java.util.NoSuchElementException;

public class Exception_Handle {

	public static void main(String[] args)   throws  IOException, NullPointerException, NoSuchElementException {
		
		try 
		{
			System.out.println(100/0);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("pass");
			System.out.println("TC done");
		}
		
		
		
		
		
		
		

	}

}
