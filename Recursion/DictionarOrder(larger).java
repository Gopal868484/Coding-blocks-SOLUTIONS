import java.util.*;
public class Main {
    private static void sol(String str, String inp, String ans) {
		
		if(inp.length() == 0){
            if(ans.compareTo(str)>0){
            System.out.println(ans);
            }
            return;
		}
		for(int i = 0; i < inp.length(); i++) {
			String restString = inp.substring(0, i) + inp.substring(i + 1);
			char ch = inp.charAt(i);
			
			sol(str,restString, ans + ch);
		}
	}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String stringsorted = new String(chars);
        sol(str,stringsorted,"");
    }
}
