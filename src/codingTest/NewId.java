package codingTest;

public class NewId {

	public static void main(String[] args) {
		String new_id = "abcdefghijklmn.p";
        String answer = "";
        //1단계 모든 단어를 소문자로 치환합니다.
        new_id=new_id.toLowerCase();
        System.out.println(new_id);
        //2단계 소문자, 숫자, 빼기, 밑줄, 마침표를 제외한 모든 문자를 제거합니다.
        new_id=new_id.replaceAll("[^a-z0-9-_.]", "");
        System.out.println(new_id);
        //3단계 마침표가 두 번 이상 연속된 부분을 하나의 마침표로 치환합니다.
        new_id=new_id.replaceAll("[.]{2,}", ".");
        System.out.println(new_id);
        //4단계 new_id에서 마침표가 처음이나 끝에 위치한다면 제거합니다.
        new_id=new_id.replaceAll("^[.]", "");
        new_id=new_id.replaceAll("[.]$", "");
        System.out.println(new_id);
        //5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if(new_id.equals("")){
            new_id="a";
        }
        System.out.println(new_id);
        //6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개 문자를 제외한 나머지 문자들을 모두 제거합니다.
        if(new_id.length()>=16){
            new_id=new_id.substring(0,15);
            new_id=new_id.replaceAll("[.]$", "");
        }
        System.out.println(new_id);
        //만약 제거후 마침표가 new의 끝에 위치한다면 끝에 위치한 마침표를 문자를 제거합니다.
        //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        while(new_id.length()<=2){
            String n = new_id.substring(new_id.length()-1,new_id.length());
            new_id=new_id+n;
        }
        System.out.println(new_id);
        
        
        answer=new_id;    
        System.out.println(new_id);
	}

}
