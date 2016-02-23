package core.javapitfalls.book;

public class Oddity {

	public static void main(String[] args) {
		System.out.println(isOdd(10));
		
		System.out.println(isOdd(11));
		
		System.out.println(isOdd(17267326));
		
		System.out.println(isOdd(132323));
		
		System.out.println(isOdd(-1));
	}
	
	public static boolean isOdd(int i){
		return i%2 == 1;
	}	
	
}