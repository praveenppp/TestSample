package InitialClasses;

public class callByReference 
{
	public int a = 10;
	
	private static void print(int a)
	{
		System.out.println("value of a ="+ a);
	}
	
	public static void call(callByReference ref)
	{
		
		print(ref.a);
	}
}
