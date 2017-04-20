package com.paypal.samples.Trainer.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteFile {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream output = new FileOutputStream("IOlog.txt");
		
		for(int i=1;i<=10;i++){
			output.write(i);
		}
		output.close();
		
		
		FileInputStream input = new FileInputStream("IOlog.txt");
		
		int value;
		while((value=input.read())!= -1) //Check for EOF
		{
			System.out.println(value + " ");
		}
		input.close();
		
	}

}
