import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
    String s = input.nextLine();
    int sum = 0;
    for(int i=0; i<s.length(); i++){
        if(s.charAt(i)>='0' && s.charAt(i)<='9') sum += s.charAt(i) - '0';
    }
    
    System.out.println(sum);
    
  }


}
