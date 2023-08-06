import java.lang.*;
class Constructor 
{
	int width,height,length;			   // instance variable
	Constructor(int width1,int height1,int length1)    // parameterised constructor
	{
		width=width1;
		height=height1;
		length=length1;
	}
	
	public static void main(String[]args)
	{
		Constructor obj=new Constructor(2,9,5);
		//call constructor,to initialise class members
		System.out.println(obj.width+" "+obj.height+" "+obj.length);

	}
}