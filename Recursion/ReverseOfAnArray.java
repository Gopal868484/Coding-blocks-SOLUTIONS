import java.util.*;
public class Main {
    private static void reverse(int[] arr, int ci , int n){
        if(ci == n) {
			return;
		}
		reverse(arr,ci + 1,n);
		System.out.print(arr[ci]+" ");

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr,0,n);
    }
}
