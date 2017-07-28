package com.devin.programdesign.zijieliu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileZiJie {
	public static void main(String[] args) {
		String path = "E:/java_plan/JulyPlan/Course/JavaProgram/src/com/devin/programdesign/Files/filetest.txt";
		String writemessage0 = "devin";
		String writemessage1 = "Julia";
		File file = new File(path);
		int c = 0;
		try {
			//create new file
			if(!file.exists())
			{
				if(file.createNewFile())
					{
						System.out.println("Create New File " + path +" Success");
					}else {
						System.out.println("Create file failed");
					}
			}
		//字节流
		FileInputStream fileInputStream = new FileInputStream(file);
		FileOutputStream fileOuputStream = new FileOutputStream(file);
		//字节流写操作
		fileOuputStream.write(writemessage0.getBytes());
		fileOuputStream.write(writemessage1.getBytes());
		//字节流读操作
		while((c = fileInputStream.read()) != -1) {
			System.out.println((char)c);
		}

		}catch(IOException err) {
			System.out.println(err.getMessage());
		}
	}
}
