class Dencapsulation {
	int i;
	static int j;
	Dencapsulation(int i1,int j1){
		i=i1;
		j=j1;
	}
	void m(){
		System.out.println(i+" "+j);
	}
	static void m2(){
		Dencapsulation obj=new Dencapsulation(5,10);
		System.out.println(obj.i+" "+j);
	}
}
