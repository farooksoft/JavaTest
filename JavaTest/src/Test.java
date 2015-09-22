
public class Test {
	
	public static void main(String[] args) {
		
		//System.out.println("srinath , ".contains("srinath"));
		//String abc = "125+584+417";
		//System.out.println(abc.split("\\+")[0]);
		
		String[] arrayStr = {"aa", "bb", "cc"};
		
		StringBuilder builder = new StringBuilder();
		for(String str : arrayStr){
			builder.append(str);
			builder.append("+");
		}
		
		System.out.println(builder.toString());
	}

}
