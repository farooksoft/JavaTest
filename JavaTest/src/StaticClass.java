
public class StaticClass {

	static class StaticCL{
		static int classVariable;
		int objVariable;
	}
	
	public static void main(String[] args) {
		
		System.out.println(StaticCL.classVariable);
		
		StaticCL cl = new StaticCL();
		System.out.println(cl.objVariable);
	}
	
}
