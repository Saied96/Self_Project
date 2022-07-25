package Java_tutorial;
public class Calculator {
	
	int[] a1={1,20,3,4};
	
	
int a=30;
	int b=30;
	int total=10+5;
	int total2=20;
	
	public int sum() {
		
		total2=a+b;
		total2=total2-3;
		return total2;
	}
	
public int mul() {
		
		total2=a*b;
		//total2=total2-3;
		return total2;
	}
public int div() {
	
	total2=a/b;
	
	return total2;
}
	public static void main(String[] args) {
		
//		int total=10+5;
//		int total2=15;
		//System.out.println("Total=total ");
	//	System.out.println("Total= "+total);
		
		
		Calculator obj1=new Calculator();
		
		System.out.println("Total= "+obj1.total2);
		System.out.println("Total= "+obj1.sum());
		
		System.out.println("TotalMul= "+obj1.mul());
		
//		System.out.println("a[1]= "+obj1.a1[0]);
//		System.out.println("a[2]= "+obj1.a1[1]);
//		System.out.println("a[3]= "+obj1.a1[2]);
//		System.out.println("a[4]= "+obj1.a1);
		
		for(int i=0;i<4;i++) {
			
			System.out.println("a["+i+"]= "+obj1.a1[i]);
			
		}
		
		
		
		
		//obj1.total;
	}
}
