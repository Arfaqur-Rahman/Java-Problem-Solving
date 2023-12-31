import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
    int a[]={2,34,5,67,7};
    int large;
    int sec;
    if (a[0] > a[1])
    {
    	large = a[0];
    	sec = a[1];
    }
    else
    {
    	large = a[1];
    	sec = a[0];
    }
    for (int i = 2; i < a.length; i++)
    {
	if (a[i] > large)
	  {
	    sec = large;
	    large = a[i];
	  }
    }
    
    System.out.println(sec);
    
  }


}
