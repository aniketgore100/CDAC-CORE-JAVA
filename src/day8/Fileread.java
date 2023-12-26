package day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fileread {

	public static void main(String[] args) {
		String p = "Mana.txt";
		FileInputStream f = null;
		try {
	          f = new FileInputStream(p);
	          while(true){
	         	 int  d = f.read();
	        	 if(d==-1) {
	        		 break;
	        		 
	        	 }
	        	 char ch = (char)d;

	 			System.out.print(ch);
	          }
		
//				strbuild.append(ch);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
			finally {
				try {
					f.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
	}

}
