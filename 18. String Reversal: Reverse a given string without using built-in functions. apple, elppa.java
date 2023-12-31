import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String s = input.nextLine();
	    char[] sArray = s.toCharArray();
	    
	    for(int i=0; i<sArray.length/2; i++){
	       char temp = sArray[i];
	       sArray[i] = sArray[s.length()-1-i];
	       sArray[s.length()-1-i] = temp;
	    }
	    System.out.println(sArray);
	}
}
