
public class Main
{
	public static void main(String[] args) {
	    int[] A={1,20,3,4,5,6};
	    int mx = A[0];
	    for(int i=1; i<A.length; i++) mx = Math.max(mx, A[i]);
		System.out.println(mx);
	}
}
