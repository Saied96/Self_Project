package resultSheet;

public class Sample002 {

	public Sample002() {
		
	}

	public static void main(String[] args) {

		
		String mark = "100"; // Total Mark.
		
		int A;
		
				/* Please input the student's mark below line-like A = Studen's mark and then you get the 
				 * result.
				 */
	
		A = 78; 	
		
		if(A>=75 && A<100)
			
		{	
			System.out.println("Roll  : 01");
			System.out.println("Name  : saied rahman");
			System.out.println("Grade : A");
			System.out.println("Mark  : "+A);
		}
		
		else if(A>=65 && A<75)
			
		{
			System.out.println("Roll  : 02");
			System.out.println("Name  : Abdur Rahim");
			System.out.println("Grade : B");
			System.out.println("Mark  : "+A);
		}
		
		else if (A>=55 && A<=65)
			
		{
			System.out.println("Roll  : 03");
			System.out.println("Name  : ehsan ul karim");
			System.out.println("Grade : C");
			System.out.println("Mark  : "+A);
		}
		
		else if (A>=40 && A<=55)
			
		{
			System.out.println("Roll  : 04");
			System.out.println("Name  : mushfiq Hossain");
			System.out.println("Grade : D");
			System.out.println("Mark  : "+A);
		}
		
		else 
		
		{
			System.out.println("Sorry! You should practice more. (That means you are fail)");
			System.out.println("Mark  : "+A);
		}

	}

}