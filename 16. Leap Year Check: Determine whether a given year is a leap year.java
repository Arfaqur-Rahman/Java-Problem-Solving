import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int year = input.nextInt();
	    System.out.println(isLeapYear(year) ? "Leap year" : "Not a leap year");
	}
	private static boolean isLeapYear(int y){
	    if(y%400==0) return true;
	    else if(y%100!=0 && y%4==0) return true;
	    else return false;
	}
}
