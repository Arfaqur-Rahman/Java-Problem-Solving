import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] A ={1,2,3,4,5};
	    float sum = 0;
	    for(int x: A) sum+=x;
	    System.out.println(sum/A.length);
	}
}
