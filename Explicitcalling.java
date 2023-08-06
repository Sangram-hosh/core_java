import java.lang.*;
class Explicitcalling
{
	int width,length,height;
	public static void main(String[]args)
	{
		Explicitcalling obj=new Explicitcalling();
		obj.width=2;
		obj.length=9;
		obj.height=5;
		System.out.println(obj.width+" "+obj.height+" "+obj.length);
	}
}