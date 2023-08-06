//Method overloading
//1-By changing number of parameter
class Polymorphism {
	int i;
	Polymorphism(int i1){
		i=i1;
		
	}
	void m(){
		System.out.println(i);
	}
	 void m(int i){
		System.out.println(this.i);
		System.out.println(i);
	}
	public static void main(String[]args){
		Polymorphism obj=new Polymorphism(10);
		obj.m();
		obj.m(100);
	}

}