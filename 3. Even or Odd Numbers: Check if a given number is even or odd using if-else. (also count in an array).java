
public class Main
{
	public static void main(String[] args) {
	    int[] A={1,21,3,4,5,6};
	    int even=0, odd=0;
	    for(int x: A) 
	        if(isEven(x)) even++; else odd++;
		System.out.println("Even: "+even+", Odd: "+odd);
	}
	
	private static boolean isEven(int n){
	    return (n%2)==0 ? true : false;
	} 
}
