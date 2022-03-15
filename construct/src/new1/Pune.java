package new1;

public class Pune 
{
	static int a=25;
	       int b=35;
	       
   Pune()
   {
	   a=15;
	   b=10;
   }
   Pune(int g)
   {
	   a=100;
	   b=200;
   }
   Pune(int f, int h)
   {
	   a=500;
	   b=600;
   }
   Pune(int e, char k)
   {
	   a=8;
	   b=9;
   }  
public static void main(String[] args)
{
	System.out.println(a);
	System.out.println(Pune.a);
	Pune x= new Pune();
	System.out.println(x.a);
	System.out.println(x.b);
	Pune y= new Pune(1500,600);
	System.out.println(y.a);
	Pune z= new Pune(5,'l');
	System.out.println(z.b);
	
}

}
