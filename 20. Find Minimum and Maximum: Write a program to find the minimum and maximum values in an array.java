import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    int[] a = {2,45,6,7,7,7,7,-3};
	    int mini = a[0];
	    int maxi = a[0];
	    for(int i=1; i<a.length; i++){
	        if(mini > a[i]) mini = a[i];
	        if(maxi < a[i] ) maxi = a[i];
	    }
	    System.out.println("Max: "+maxi+", Mini: "+mini);   
	}
}
