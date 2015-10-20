package cn.lcb.cbframework.util;

import java.util.Random;

public class NumberUtil {
		
		/**
		 * 获取N位随机数字。
		 * @param strNum 字符的位数
		 * @return
		 */
		public static String getRandomNumStr(int strNum){
			if(strNum<1){
				return "";
			}
			StringBuffer sb=new StringBuffer();
			
			Random random=new Random();
			for(int i=0;i<strNum;i++){
				int rnNum=random.nextInt(10);
				
				sb.append(rnNum);
			}
			return sb.toString();
		}

}
