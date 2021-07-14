import java.util.*;
public class Main {
    static int count;
	public static void printPath(int cr, int cc, int er, int ec, String path) {
		if(cr > er || cc > ec) {
			
			return;
		}
		
		if(cr == er && cc == ec) {
			count++;
			System.out.print(path + " ");
			return;
		}
		printPath(cr + 1, cc, er, ec, path + 'V');
		printPath(cr, cc + 1, er, ec, path + 'H');
        if (cr==cc || cr==er-cc){
        printPath(cr + 1, cc+1, er, ec, path + 'D');
        }
        
	}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPath(0, 0, n-1, n-1, "");
        System.out.println();
		System.out.println(count);
        
    }
}
