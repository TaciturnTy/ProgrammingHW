public class TestingString
{
	public static void main(String[] args)
	{
		Person p = new Person("Tyler", "Nelson", "Paulley");
		System.out.print("The name is " + p);
		System.out.println();
		System.out.print("The name is " + p.toString());
	}
}