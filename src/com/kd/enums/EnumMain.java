package com.kd.enums;

public class EnumMain {

	public static void main(String[] args) {
		Status status = Status.COMPLETED;
		switch (status) {
		case STARTED:
			System.out.println("Application started");
			break;
		case FAILED:
			System.out.println("Application failed");
			break;
		case COMPLETED:
			System.out.println("Application completed");
			break;
		default:
			throw new IllegalArgumentException("Invalid Invocation");
		}
	}
}
