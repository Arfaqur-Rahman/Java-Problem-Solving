import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int num = input.nextInt();
	    System.out.print(isPrime(num) ? "Prime" : "Not Prime");
	
	}
	
	private static boolean isPrime(int num){
	    if(num<=1) return false;
	    for(int i=2; (long)i*i<=num; i++) if(num%i==0) return false;
	    return true;
	}
}
