package com.kd.cj;

public class Outer {
	int x = 10;

	class Inner {
		int x = 100;

		public void m1() {
			int x = 1000;
			System.out.println(x);
			System.out.println(Inner.this.x);
			System.out.println(Outer.this.x);
		}
	}

	public static void main(String[] args) {
		new Outer().new Inner().m1();
	}
}
