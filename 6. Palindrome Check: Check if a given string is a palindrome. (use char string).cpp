
public class Main
{
	public static void main(String[] args) {
	    String s = "madxam";
	    System.out.print(isPal(s) ? "Palindrome" : "Not A Palindrome");
	}
	
	private static boolean isPal(String s){
	    for(int i=0; i<s.length()/2; i++){
	        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
	    }
	    return true;
	}
	
	
}
