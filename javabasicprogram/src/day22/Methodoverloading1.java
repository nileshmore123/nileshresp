package day22;

public class Methodoverloading1 {
static double res;
static public void square() {
	System.out.println("no parameter method called");
}
static public void square(int number) {
	res=number*number;
	System.out.println("method with integer parametr"+res);
}
static public void square(int number,int number2) {
	
	
	res=number*number;
	System.out.println("methode with differnt parrmeter"+res);
}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
