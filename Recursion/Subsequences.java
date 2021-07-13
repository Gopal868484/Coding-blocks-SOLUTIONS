import java.util.*;
public class Main {
    private static int genSub(String str, String ans) {

		if (str.length() == 0) {
			
			System.out.print(ans+" ");
			return 1;
		}
		
		int count = 0;
		char cc = str.charAt(0); 

		count = count + genSub(str.substring(1), ans);
		
		count = count + genSub(str.substring(1), ans + cc);
		return count;
	}
    public static void main(String args[]) {
        String newline = System.lineSeparator();
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(newline+genSub(str, ""));
    }
}
