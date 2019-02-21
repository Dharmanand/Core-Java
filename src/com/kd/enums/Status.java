package com.kd.enums;

public enum Status {

	COMPLETED(7), FAILED(9), STARTED(3), IN_PROGRESS(6);

	private int statusValue;

	private Status(int statusValue) {
		this.statusValue = statusValue;
	}
}
