
public class Main
{
	public static void main(String[] args) {
	    int n = 5;
	    long fact = 1;
	    for(int i=1; i<=n; i++) fact *= i;
	    System.out.print(fact);
	
	}
}


// Recursion

public class Main
{
	public static void main(String[] args) {
	    System.out.print(factCalc(5));
	}
	
	private static long factCalc(int n){
	    if(n==0) return 1;
	    return n * factCalc(n-1);
	}
}

