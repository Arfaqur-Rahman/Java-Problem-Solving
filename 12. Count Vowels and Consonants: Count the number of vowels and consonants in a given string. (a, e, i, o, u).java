import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String s = input.nextLine();
	    int vowel = 0, cons = 0;
	    for(Character c: s.toCharArray()){
	        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') vowel++;
	        else cons++;
	    }
	    System.out.println("Vowels: "+vowel+", Consonants: "+ cons);
	    
	}
	
}
