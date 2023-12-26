package day9;

import java.util.List;
import java.util.ArrayList;

public class Typeunsafe {

	public static void main(String[] args) {
		List cnames = new ArrayList();
		cnames.add("india");
		cnames.add("england");
		cnames.add(56);
		
		for(Object i : cnames) {
			System.out.println(i);
		}
	}

}
