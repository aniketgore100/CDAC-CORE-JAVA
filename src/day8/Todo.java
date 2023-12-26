package day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Todo {

	public static void main(String[] args) {
		String path = "aniket.txt";
		StringBuilder strBuilder = new StringBuilder();
		
		try(FileInputStream finp = new FileInputStream(path)){
			while(true) {
				int data = finp.read();
				if(data == -1) {
					break;
				}
				char ch = (char)data;
				strBuilder.append(ch);
//				System.out.println(ch);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		String newFile = "gore.txt";
		String goreData = strBuilder.toString();
		try(FileOutputStream fout = new FileOutputStream(newFile)){
			byte[] info = goreData.getBytes();
			fout.write(info);
			System.out.println("written");
		}catch(IOException e1){
			e1.printStackTrace(); 
		}
	}


}
