package Java_tutorial;

import java.util.ArrayList;
import java.util.List;

public class listMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> Countries = new ArrayList<String>();
		Countries.add("Usa");
		Countries.add("Russia");
		Countries.add("China");
		System.out.println("New ArrayList" + Countries);
		
		String str = Countries.get(1);
		System.out.print("Country at Index 1:" + str);
		Countries.set(1, "Korea");
		System.out.println("Country at Index 1:" + Countries.get(1));
		
		Countries.remove(2);
		System.out.println("Updated ArrayList: " + Countries);
		Countries.add("USA");
		System.out.println("Updated ArrayList" + Countries);
		System.out.println("Size of ArrayList" + Countries.size());
		System.out.println(" ArrayList has element Usa " + Countries.contains("USA"));
		
		
	}

}
