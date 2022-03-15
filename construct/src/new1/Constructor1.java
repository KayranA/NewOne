package new1;

public class Constructor1 {

	static int a=5;
			int b=10;
		Constructor1()
		{
			a=25;
			b=26;
		}
		Constructor1(int x)
		{
			a=500;
			b=600;
		}
		Constructor1(int x, int y)
		{
			a=1;
			b=2;
		}
		Constructor1(int x, char y)	
		{
			a=33;
			b=44;
		}
	public static void main(String[] args)
	{
		System.out.println(a);
		System.out.println(Constructor1.a);
		
		Constructor1 x= new Constructor1(15, 'a');
		System.out.println(x.a);
		System.out.println(x.b);
	}
}
