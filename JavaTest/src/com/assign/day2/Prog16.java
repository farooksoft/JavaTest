package com.assign.day2;

import java.lang.reflect.Method;

class X {
	void do1() {
		System.out.println("Hi...");
	}
}

class Y extends X {
	public void do2() {
		System.out.println("do2");
	}
}

public class Prog16 {
	public static void main(String[] args) throws Exception {
		X x1 = new X();
		X x2 = new Y();
		Y y1 = new Y();
		// (Y)x2.do2();
		Class<? extends X> c = x2.getClass();
		Method m = c.getMethod("do2", new Class[] {});
		m.invoke(x2, new Object[] {});
		// do2 is invoke if it is public

	}

}
