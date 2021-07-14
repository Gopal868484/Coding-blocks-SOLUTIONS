import java.util.*;
public class Main {
    static String[] mapping = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
    	public static void keypad(String digits, String comb) {

		if (digits.length() == 0) {
			System.out.println(comb);
			return;
		}
		char digitPressed = digits.charAt(0);
		int index = digitPressed - '0';

		String mappedString = mapping[index];

		for (int i = 0; i < mappedString.length(); i++) {

			String leftString = digits.substring(1);
			char choice = mappedString.charAt(i);
			keypad(leftString, comb + choice);
		}

	}
    
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        keypad(str,"");
    }
}
