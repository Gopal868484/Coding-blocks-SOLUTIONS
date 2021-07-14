import java.util.*;
public class Main {
    static int count = 0;
    static String[] mapping = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx","yz" };

    	public static void keypad(String digits, String comb) {

		if (digits.length() == 0) {
            count++;
			System.out.print(comb+" ");
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
        System.out.println();
        System.out.println(count);
    }
}
