package sample;

public class Palindrome12 {

	public static void main(String[] args) {
		
		
		String  str="madam";
		
		String rev="";
		
		int count=str.length();
		
		System.out.println(count);
		
		for (int i = count-1; i >= 0; i--)
		{
			rev=rev+str.charAt(i);
			
			
		}
		
		System.out.println(rev);
		
		
		if(str.equals(rev))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not palindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
