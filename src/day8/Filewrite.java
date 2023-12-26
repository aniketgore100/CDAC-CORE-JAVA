package day8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//This program writes the information into some file.
public class Filewrite {

	public static void main(String[] args) {
	   String p = "Mana.txt";
	   String S = "Manali here";
	   try (FileOutputStream f = new FileOutputStream(p, true)){
		   byte [] info = S.getBytes();
	      f.write(info);
	   } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}