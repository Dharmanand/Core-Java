package com.kd.stack;

public class StackMain {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(16);
		stack.push(12);
		stack.push(122);
		stack.push(121);
		stack.push(55);
		stack.push(96);
		stack.push(154);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
