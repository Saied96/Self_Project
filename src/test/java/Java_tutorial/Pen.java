package Java_tutorial;

public class Pen {

		String type = "gel";
		String color = "black";
		int point = 10;
	
	static boolean clicked = false;

	public static void click() {
		clicked=true;
	}
	public static void unclick() {
		clicked=false;
	}
	
}
