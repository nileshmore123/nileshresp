package day22;

interface c1{
	void display();
}
class A1 {
	static int b = 25;
	double c = 22.3;
public void display(){
	System.out.println("i am interface");
	
}
}

class B1 extends A1 {
	int p = 25;
	float k = 45.2f;
}


public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 in = new B1();
System.out.println("class A"+in.b);
System.out.println("classA1"+in.c);
System.out.println("class A");

	}
	

}
