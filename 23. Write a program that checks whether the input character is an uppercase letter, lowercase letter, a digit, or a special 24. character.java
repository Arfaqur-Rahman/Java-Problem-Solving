import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    String s = input.next();
	    
	    Character c = s.charAt(0);
	    if(c>='A' && c<='Z')
	        System.out.println("Capital");
	    else if(c>='a' && c<='z')
	         System.out.println("Small");
	    else if(c>='0' && c<='9')
	         System.out.println("Digit");
	    else 
	        System.out.println("Special");
	    
	}
	
	
}
