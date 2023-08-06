class Variables{
	int i;                                 //instance variable 
	static int j;			      // static variable
	Variables(int i1,int j1){
		i=i1;
		j=j1;
	}
	public static void main(String args[])
	{
		int k=0;				// local variable
		Variables obj1=new Variables(1,2);
		Variables obj2=new Variables(3,4);
		System.out.println(obj1.i+""+obj1.j+""+k);
		System.out.println(obj2.i+""+obj2.j+""+k);
	}
}	