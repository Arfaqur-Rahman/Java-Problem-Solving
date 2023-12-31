import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int num = input.nextInt();
	    
	    int prevprev=0;
	    int prev=1;
	    System.out.print(0 + " " + 1 + " ");
	    for(int i=2; i<=num; i++) {
	        int curr = prevprev + prev;
	        System.out.print(curr+ " ");
	        prevprev = prev;
	        prev= curr;
	    }
	}
}


// Recursion
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int num = input.nextInt();
	    
	    int[] a = new int[100];
	    for(int i=0; i<a.length; i++) a[i]=-1;
	    for(int i=0; i<=num; i++) 
	    System.out.print(fib(i, a) + " ");
	
	}
//0 1 1 2 3 5 8	
	private static int fib(int n, int[] A){
	    
	    if(n<=1) return n; 
	    if(A[n]!=-1) return A[n];
	    return A[n] = fib(n-1, A) + fib(n-2, A);
	}
}

