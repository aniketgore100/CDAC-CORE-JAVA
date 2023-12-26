package day8;

import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		Vector dataValues = new Vector();
		System.out.println("Initial Size: " + dataValues.size());
		System.out.println("Initial Capacity: " + dataValues.capacity());
		dataValues.add("Hello");
		dataValues.add("Hello");
		dataValues.add("Hello");
		dataValues.add("Hello");
		dataValues.add("Hello");
		dataValues.add("Welcome");
		dataValues.add(35);
		dataValues.add(true);
		dataValues.add(4.56);
		System.out.println("New Size: " + dataValues.size());
		System.out.println("New Capacity: " + dataValues.capacity());
		
		//----Adding 7 more elements----
		for(int a=1;a<=7;a++)
			dataValues.add(a);
		System.out.println("Final Size: " + dataValues.size());
		System.out.println("Final Capacity: " + dataValues.capacity());
		
		
		for(Object obj : dataValues)
			System.out.println(obj);

	}

}
