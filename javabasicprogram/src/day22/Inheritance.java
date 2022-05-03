package day22;

class fruit {
	fruit() {
		System.out.println("fruits class cons..");
	}

	public void taste() {
		System.out.println("fruit are sweet....");
	}
}

class apple extends fruit {
	apple() {
		System.out.println("apple is fruit");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method
		apple fr = new apple();

	}

}
