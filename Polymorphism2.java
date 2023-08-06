//Method overloading
//2-By changing the data type of parameters
class Polymorphism2 {
	
	void m(int i){
		System.out.println(i);
	}
	 void m(float i){
		System.out.println(this.i);
		System.out.println(i);
	}
	public static void main(String[]args){
		Polymorphism obj=new Polymorphism(10);
		obj.m(10);
		obj.m(10.5f);
	}

}