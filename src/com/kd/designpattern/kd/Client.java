package com.kd.designpattern.kd;

public class Client {

	public static void main(String[] args) {

		// create our model
		DataModel ourModel = new DataModel("Testing");
		// create an anonymous class that implements DataListener
		DataListener listener = new DataListener() {
			public void dataChanged(Object o) {
				System.out.println("This is a test");
			}
		};
		ourModel.addListener(listener);
		ourModel.setData("Testing 2 !!");
		ourModel.setData("Testing 3 !");
		ourModel.setData("Testing 4 !");

	}
}
