package com.devin.programdesign;

public class JinZhiTrans {
	public static enum JinZhiEnum {
		OCT, SHI, HEX
	}


	/**
	 * jinZhiTransfer: 进制相互转换方法，思路是通过罗列法列出，有很多情况考虑不全
	 * @param obj : 需要转换的数据
	 * @param frmType ： 需要转换的进制
	 * @param toType ： 转换成的进制
	 * @return
	 */
	public Object jinZhiTransfer(Object obj, JinZhiEnum frmType, JinZhiEnum toType) {
		try {
			if ((JinZhiEnum.OCT == frmType) && (JinZhiEnum.SHI == toType)) {
				String oct = obj.toString();
				int octResult = Integer.parseInt(oct);
				octResult = ((octResult / 10) * 8) + (octResult % 10);
//				System.out.println(octResult);
			}

			else if ((JinZhiEnum.OCT == frmType) && (JinZhiEnum.HEX == toType)) {

			}

			else if ((JinZhiEnum.SHI == frmType) && (JinZhiEnum.HEX == toType)) {

			}

			else if ((JinZhiEnum.SHI == frmType) && (JinZhiEnum.OCT == toType)) {

			}

			else if ((JinZhiEnum.HEX == frmType) && (JinZhiEnum.OCT == toType)) {

			}

			else if ((JinZhiEnum.HEX == frmType) && (JinZhiEnum.SHI == toType)) {

			}

			else {
				System.out.println("input frm or to type is error");
				return obj;
			}
		} catch (Exception err) {
			System.out.println(err.getMessage());
		}

		return obj;
	}
	//test	
	public static void main(String[] args) {
		JinZhiTrans jinzhitrans = new JinZhiTrans();
		jinzhitrans.jinZhiTransfer(75, JinZhiEnum.OCT, JinZhiEnum.SHI);
	}

}
