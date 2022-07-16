
public class CoreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// string is an object
		/*String s = "saiedur rahman";
				String s1 = "saiedur rahman";*/
		//new
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String s ="Rahul Shetty Academy";
		String[] splittedString = s.split("Shetty");
				System.out.println(splittedString[0]);
				System.out.println(splittedString[1]);
				//System.out.println(splittedString[2]);
				//System.out.println(splittedString[3]);
				System.out.println(splittedString[1].trim());
	}

}
