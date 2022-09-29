public class Car1 {
	public  String make;
	public static String model;
  public static String company;
	
  public static int count = 0;
  
  public Car1(){
    ++count;
  }
}

class car1 {
  public static void main(String[] args) {
  Car1 c1 = new Car1();
  Car1 c2 = new Car1();
   Car1 c3 = new Car1();
    Car1 c99 = new Car1();
    Car1 c11 = new Car1();
    
  Car1.model = "CRV";
    Car1.company = "Toyota";
   
  
System.out.println("Total car object created:" + Car1.count);

  }
}