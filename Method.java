class Method{
	int i;                                 //instance variable 
	static int j;			      // static variable
	Method(int i1,int j1){
		i=i1;
		j=j1;
	}
	
	void m1(){
			System.out.println(i+""+j);
			m2();
			m3();
	}

	static void m2(){
			Method obj2=new Method(10,20);
			System.out.println(obj2.i+""+j);
	}

	void m3(){
			System.out.println(i+""+j);
	}

	public static void main(String args[])
	{
		
		Method obj=new Method(1,2);
		
		m2();
		obj.m1();
		obj.m3();
		
		
	}
}	