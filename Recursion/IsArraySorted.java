import java.util.*;
public class Main {
    private static boolean sorted(int[] arr,int ci, int n){
        if (ci==n-1){
            return true;
        }

        if (arr[ci]<=arr[ci+1]){
            return sorted(arr,ci+1,n);
        }
        else{
            return false;
        }
       
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(sorted(arr,0,n));
    }
}
