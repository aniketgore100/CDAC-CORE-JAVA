package day9;

import java.util.ArrayList;
import java.util.List;

public class Typesafe {

	public static void main(String[] args) {
		List<String>cnames = new ArrayList<>();
		cnames.add("Indian");
		cnames.add("china");
		
		for(String i : cnames) {
			System.out.println(i.toUpperCase());
		}
	}

}
