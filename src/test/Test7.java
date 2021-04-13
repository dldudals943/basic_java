package test;

public class Test7 {

	public static void main(String[] args) {
		String tree1 = "abcd";
		String tree = "[^abcd]";
		String skill = "oelgiufnvkdbba";
		skill = skill.replaceAll(tree,"");
		boolean ar = true;
		if(!skill.equals("")){
			for(int i = 0; i < skill.length(); i++){
				if(tree1.charAt(i)!=skill.charAt(i)){
					ar = false;
					break;
				}
			}
			
		}
		System.out.println(ar);
	}

}
