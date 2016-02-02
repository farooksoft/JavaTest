import java.util.Scanner;


public class Staircase {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int _n;
		_n = Integer.parseInt(scanner.nextLine().trim());
		
		
		for(int i=1;i<=6;i++){
			for(int j=6;i<j;j--){
				System.out.print(" ");
			}
			for(int j=0;j<i;j++){
				System.out.print("#");
			}
			System.out.println(" ");
		}
		
		
		int[] loopArray = {1, 2, 3,4,5};
		long sum = 0;
		for(int i=0; i<loopArray.length; i++){
			sum = sum + loopArray[i];
		}
		
	}
}
