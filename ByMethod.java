import java.lang.*;
class ByMethod {
	int width,height,length;
	void setM(int width1,int length1,int height1)
	{
		width=width1;
		height=height1;
		length=length1;
		
	}
	
	 void getM(){
		
		System.out.println(width+" "+height+" "+length);
	}

	public static void main(String[]args)
	{
		ByMethod obj1=new ByMethod();
		obj1.setM(2,6,9);
		obj1.getM();
		
	}
}