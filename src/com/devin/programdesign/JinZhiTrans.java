package com.devin.programdesign;

import java.util.Stack;

public class JinZhiTrans {
	private static final String CODEING_STRING= "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$.`";
	
	/**
	 * baseConvert:现将非10进制需要的转换成10进制，再又10进制转换成任一进制
	 * @param s ：输入值，以字符串输入
	 * @param srcBase ：输入字符进制
	 * @param destBase ：需要转换的目标进制
	 * @return
	 */
	public String baseConvert(String s, int srcBase, int destBase)
	{
		if(srcBase == destBase)
		{
			return s;
		}
		
		char[] sr = s.toCharArray();
		int length = sr.length;
		if(destBase != 10)
		{
			s = baseConvert(s, srcBase, 10);
		}else {
			long n = 0;
			for(int i = length -1; i >=0; i-- )
			{
				n += CODEING_STRING.indexOf(sr[i]) * Math.pow(srcBase, length -i -1);
			}
			return String.valueOf(n);
			
		}
		
		return shiJinZhiToAny(Integer.valueOf(s), destBase);
	}
	
	public String shiJinZhiToAny(int intVal, int destBase)
	{
		StringBuilder strBuild = new StringBuilder();
		Stack<String> sta = new Stack<String>();
		while(intVal != 0)
		{
			sta.push(CODEING_STRING.charAt((int)intVal%destBase)+ "");
			intVal/=destBase;
		}
		
		while(!sta.isEmpty())
		{
			strBuild.append(sta.pop());
			
		}
		
		return strBuild.length() == 0 ? "0": strBuild.toString();
	}
	
	//test测试
	public static void main(String[] args) {
		JinZhiTrans jinZhiTrans = new JinZhiTrans();
		String result = jinZhiTrans.baseConvert("96", 10, 8);
		System.out.println(result);
	}
}
