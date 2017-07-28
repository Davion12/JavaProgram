package com.devin.programdesign.zifuliu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.devin.programdesign.JinZhiTrans;

public class FileZiFu {
	public static void main(String[] args) {
		String path = "E:/java_plan/JulyPlan/Course/JavaProgram/src/com/devin/programdesign/zifuliu/filezifu.txt";
		try {
			File file = new File(path);
			if (!file.exists()) {
				if (file.createNewFile()) {
					System.out.println("create new file" + path + "success");
				} else {
					System.out.println("create file failed");
				}
			}
			//字符写操作
			BufferedWriter bufferwrite = new BufferedWriter(new FileWriter(path));
			bufferwrite.write("abcdef");
			bufferwrite.newLine();
			bufferwrite.write("ghijk");
			bufferwrite.close();
			
			//字符读操作，默认ASCII编码
			BufferedReader bufferreader = new BufferedReader(new FileReader(path));
			String line;
			while ((line = bufferreader.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println((new FileReader(path)).getEncoding());
			bufferreader.close();
			//进制转换用Integer中的方法，有toHexString、toOctalString、toBinString
			String str = "java_plan";
			byte[] by = str.getBytes("utf-8");
			int hex;
			for(int i = 0; i < by.length; i++) {
				System.out.println(by[i]);
				hex = by[i] & 0xFF;
				System.out.println("0x" + Integer.toHexString(hex));
			}
		} catch (IOException error) {
			System.out.println(error.getMessage());
		}

	}
}
