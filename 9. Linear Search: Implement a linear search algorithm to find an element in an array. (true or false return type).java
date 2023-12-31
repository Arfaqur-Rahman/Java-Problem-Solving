import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    int A[] = {2,3,4,5,6,7,8,9};
	    System.out.println( isPresent(A, n) ? "Found " + n : n+" Not Found" );
	}
	
	private static boolean isPresent(int[] A, int target){
	    for(int i=0; i<A.length; i++){
	        if(A[i]==target) return true;
	    }
	    return false;
	}
	
}
