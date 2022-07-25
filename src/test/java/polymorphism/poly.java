package polymorphism;

class Bird {
	public void sing() {
		System.out.println(" tweet tweet");

	}
}

class Robin extends Bird {
	public void sing() {
		System.out.println(" hmmm hmmm");
	}
}

class Parrot extends Bird {
	public void sing() {
		System.out.println("chhh chhp");
	}
}

public class poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parrot MyParrot = new Parrot();
		MyParrot.sing();
		;
	}

}
