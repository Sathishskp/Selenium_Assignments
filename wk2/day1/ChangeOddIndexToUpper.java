package wk2.day1;

public class ChangeOddIndexToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Sathish";
		
		char[] ch =name.toCharArray();
		
		for (int i = 0; i < ch.length; i=i+2) {
		ch[i]=Character.toUpperCase(ch[i]);
		}
		System.out.println(new String(ch));
	}

}
