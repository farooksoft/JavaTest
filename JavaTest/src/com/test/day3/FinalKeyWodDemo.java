package com.test.day3;
/**
 * 
 * final for a class is not inheritable<p>
 * final for a method is nt overridden <p>
 * final for a variable is not changeable <p>
 * @author srinath
 *
 */
public class FinalKeyWodDemo {

		public static void main(String[] args) {
			new ChildConst();
			new ChildConst("Valtech");
		}
	}

	class ParentFinal{
		
		public ParentFinal(String s) {
			
			System.out.println("Parent constructor called..."+s);
		}
		final void A(){
			
		}
	}
	class ChildFinal extends ParentFinal{
		
		public ChildFinal() {
			super("srinath");
			System.out.println("Child constructor called...");
		}
		public ChildFinal(String s) {
			super(s);
			
			System.out.println("Child constructor called...");
		}
//		void A(){
//			
//		}
	}
