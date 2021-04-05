package i_api;

import e_oop.ScanUtil;

public class SetComma {

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자에  3자리 마다 콤마(,)를 붙여 출력해주세요.
		 * 1,234,567
		 */
		System.out.println("숫자 입력");
//		String str = ScanUtil.nextLine();
//		String str2 = "";
//		int n = str.length()%3;
//		
//		for(int i = 0 ; i<str.length(); i ++){
//			if (i == n && n!=0){
//				str2 += ",";
//			}
//			if (i > n && (i-n)%3 == 0){
//				str2 += ",";
//			}
//			str2 += str.charAt(i);
//		}
//		System.out.println(str2);
//		
		
//		String ab = ScanUtil.nextLine();
//		StringBuffer a = new StringBuffer(ab);
//		int nn = ab.length()%3; 
//		int count = 0;
//		
//		for(int i = 0 ; i < a.length() ; i++){
//			if(nn==0 && i ==0) continue;
//			if(nn+3*i+count < a.length()-1){
//				a.insert(nn+3*i+count++,",");
//			}
//		}
//		
//		System.out.println(a);
//		
		
//		String abc = ScanUtil.nextLine();
//		System.out.println(abc.length());
//		String abc2 = "";
//		for(int i = abc.length()-1 ; i >=0; i --){
//			if((abc.length()-1 - i)!=0 && (abc.length()-1-i)%3==0){
//				abc2 = "," + abc2;
//			}
//			abc2 = abc.charAt(i) + abc2;
//		}
//		
//		System.out.println(abc2);
//		
		

		String abc = ScanUtil.nextLine();
		System.out.println(abc.length());
		String abc2 = "";
		int count=0;
		for(int i = abc.length()-1 ; i >=0; i --){
			if(count%3==0 && count!=0){
				abc2 = "," + abc2;
			}
			abc2 = abc.charAt(i) + abc2;
			count++;
		}
		
		System.out.println(abc2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
