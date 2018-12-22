package com.kd.equalAndHashcode;

/***
 * @author Kumar
 * 
 * VVI: If you want that your user defined objects should be equals wrt any attribute then it must override
 * 		both hashCode() and equals() methods in your class. until both object will not be equals. 
 * 
 * Note: 
 * 	1.   If two objects are equal according to their equals() method,
 * 		 they must also have the same hash code. 
 *  2.   If two objects have the same hash code, 
 * 		 they do NOT have to be equal too.
 * 
 * Here is the actual wording from the java.util.Object documentation:	 
 * 	->   If two objects are equal according to the equals(Object) method, 
 * 		 then calling the hashCode method on each of the two objects must produce the same integer result.
 *	->   It is not required that if two objects are unequal according to the equals(java.lang.Object) method, 
 *		 then calling the hashCode method on each of the two objects must produce distinct integer results. 
 *		 However, the programmer should be aware that producing distinct integer results for unequal objects
 *		 may improve the performance of hash tables.
 * 
 * Object Class hashCode() and equals() method implementation are:
 * 
 * 		1. public native int hashCode();
 * 		2. public boolean equals(Object obj) {
 *       		return (this == obj);
 *  		}
 * 
 * Please don't think object reference is a return of toString(); both are different.
 * object != object.toString().
 * 
 * 
 */
import java.util.HashSet;

public class HashCodeAndEqualsMethodsOverride {

	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<>();

		Person p1 = new Person(101, "Kumar");
		Person p2 = new Person(102, "Dharma");
		Person p3 = new Person(101, "Kumar");

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		System.out.println("p1.equals(p1.toString()) -> "+p1.equals(p1.toString()));
		System.out.println(p1.equals(p3));
		System.out.println(p1==p3);
		System.out.println(p1.toString().equals(p3.toString()));
		
		set.add(p1);
		set.add(p2);
		set.add(p3);

		System.out.println(set);

	}

}

class Person {
	private Integer id;
	private String name;

	public Person(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}
