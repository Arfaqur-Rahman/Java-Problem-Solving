import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    int A[] = {2,3,4,5,6,7,8,9};
	    System.out.println(binSearch(A, n) ? "Found " + n : n + " Not Found");
	}
	
	private static boolean binSearch(int[] A, int target){
	    int l = 0;
	    int h = A.length-1;
	    while(l<=h){
	        int mid = (l+h)/2;
	        if(A[mid]==target) return true;
	        else if(A[mid]>target) h = mid -1;
	        else l = mid + 1;
	    }
	    return false;
	}
	
}
