import java.util.*;
public class Main {
    private static void lexicographical(int start, int end){
        if(start > end) {
    		return;
		}
		System.out.print(start+" ");	
		int mycallNumber = 0;
		if(start == 0) {
			mycallNumber = 1;
		}
		while(mycallNumber <= 9) {
			lexicographical(start * 10 + mycallNumber, end);
			mycallNumber++;
		}
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        lexicographical(0,n);
    }
}
