import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[][] A = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
	    int[][] B = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
	    
	    int[][] ans = new int[5][5];
	    for(int i=0; i<5; i++){
	        for(int j=0; j<5; j++){
	            ans[i][j] = A[i][j] + B[i][j];
	        }
	    }
	    
	    for(int i=0; i<5; i++){
	        for(int j=0; j<5; j++){
	            System.out.print(ans[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
}
