import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    int n = input.nextInt();
	    
	    int num = n;
	    int numOfDigits = 0;
	    while(n>0){
	        numOfDigits++;
	        n/=10;
	    }
	    
	    n=num;
	    int sum = 0;
	    while(num>0){
	        sum += (int) Math.pow(num%10, numOfDigits);
	        num/=10;
	    }
	    
	    
	    System.out.println( n + (sum==n ? " is an Armstrong number" : " is not an Armstrong number"));
	    
	    
	}
}
