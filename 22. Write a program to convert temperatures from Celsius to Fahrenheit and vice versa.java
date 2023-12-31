import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	   
	    int temp = 50;
	    System.out.println(cToF(temp));
	    System.out.println(fToC(temp));
	    
	}
	//c/5=(f-32)/9
	private static int cToF(int c){
	    return 9*c/5 + 32;
	}
	
	private static int fToC(int f){
	    return 5*(f-32)/9;
	}
	
}
