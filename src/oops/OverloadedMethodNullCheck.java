package oops;

// Overloaded Method Null Check 

public class OverloadedMethodNullCheck {

	public Integer add(Integer i, Integer j) {
		return i + j;
	}
	public Float add(Float i, Float j) {
		return i + j;
	}
	
	
	public static void main(String[] args) {
		System.out.println(add(null, null));//CTE : The method add(Integer, Integer) is ambiguous for the type OverloadedMethodNullCheck
	}

}
