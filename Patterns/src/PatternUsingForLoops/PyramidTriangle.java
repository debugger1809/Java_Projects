package PatternUsingForLoops;
import java.util.Scanner;
public class PyramidTriangle {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No. of Rows: ");
		
		int row = sc.nextInt();
		
		for (int i =0; i <row-1; i++) {
			for (int j= 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
