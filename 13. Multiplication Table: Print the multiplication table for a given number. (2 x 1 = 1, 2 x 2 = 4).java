import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int num = input.nextInt();
	    for(int i=0; i<=10; i++) 
	        System.out.println(num+ "x" + i +" = "+ i*num);
	}
}
