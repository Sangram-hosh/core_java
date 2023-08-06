//Method overloading
//4-By combining 1 and 2
class Polymorphism4 {
	
	void m(int i,float j){
		System.out.println(i+" "+j);
	}
	 void m(double i){
		System.out.println(i);
	}
	public static void main(String[]args){
		Polymorphism4 obj=new Polymorphism4();
		obj.m(20,10.5f);
		obj.m(10.5);
	}

}