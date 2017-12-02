package sample;

public class Para2 {

	
	void mul()
	{
		System.out.println("another class");
	}
	
	public static void main(String[] args) {
		
		Parameters1 obj=new Parameters1();
		Para2 obj2=new Para2();
		
		obj.add(10, 20);
		obj.sub();
		
		obj2.mul();
		
		

	}

}
