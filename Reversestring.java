package paper;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madam";
		String t =   "";

		for(int i = s.length()-1; i>0; i--);
		{
	

		System.out.println(s.charAt(i));
		t= t+ s.charAt(i);

	}
}
}