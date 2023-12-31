import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    int A[] = {2,3,4,5,6,7,8,9,9};
	    System.out.println(isDuplicate(A) ? "There are duplicate elements" : "No duplication");
	    
	}
	
	private static boolean isDuplicate(int[] A){
	    for(int i=0; i<A.length; i++){
	        for(int j=i+1; j<A.length; j++){
	            if(A[i]==A[j]) return true;
	        }
	    }
	    return false;
	}
	
}
