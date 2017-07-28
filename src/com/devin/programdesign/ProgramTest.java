package com.devin.programdesign;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ProgramTest {

	public static void main(String[] args) {
		// 一維數組
		/*
		 * int[] m = new int[10]; Random rnd = new Random(); for (int i = 0; i <
		 * m.length; i++) { m[i] = rnd.nextInt(10); } System.out.println(m[9]);
		 */
		//四则运算小测试
		SiZeOperation sizeOp = new SiZeOperation();
		System.out.println("请输入你要做的运算:\n1、加法\n2、减法\n3、乘法\n4、除法");
		Scanner input = new Scanner(System.in);
		int op = input.nextInt();
		System.out.println("请输入你的计算的数值，按回车进行数值切换和结束");
		float a = input.nextFloat();
		float b = input.nextFloat();
		float result = 0;
		switch(op)
		{
		case 1:
			result = sizeOp.add(a, b);
			break;
		case 2:
			result = sizeOp.sub(a, b);
			break;
		case 3:
			result = sizeOp.multi(a, b);
			break;
		case 4:
			result = sizeOp.divide(a, b);
			break;
		default:
			System.out.println("你输入的运算符有误！");
			break;
		}
		
		
		
	}
}
