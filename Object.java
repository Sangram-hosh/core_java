import java.lang.*;
class Object
{
	static Object obj; // obj equal object reference/name
	public static void main(String args[])
	{
		obj=new Object();// new is the keyword,to create a new object
		//new equal malloc or calloc in c
		System.out.println(obj.hashCode()); //gives id of the object
		obj=new Object();
		System.out.println(obj.hashCode());
	}
}
