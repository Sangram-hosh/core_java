//Method overloading
//3-By changing sequence of data type of arguments
class Polymorphism3 {
	
	void m(int i,float j){
		System.out.println(i+" "+j);
	}
	 void m2(int j,float i){
		System.out.println(i+" "+j);
	}
	public static void main(String[]args){
		Polymorphism3 obj=new Polymorphism3();
		obj.m(20,10.5f);
		obj.m2(10,20.5f);
	}

}