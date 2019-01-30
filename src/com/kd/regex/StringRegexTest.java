package com.kd.regex;
/**
 * @author Kumar
 * 
 * Difference between those expressions
 * x = x.replaceAll("\\s", "");
 * x = x.replaceAll("\\s+", "");
 * 
 * Ans: 
 *
 *The first one matches a single whitespace, whereas the second one matches one or many whitespaces. 
 *They're the so-called regular expression quantifiers, and they perform matches like this (taken from the documentation):
 *
 *Greedy quantifiers
 *X?  X, once or not at all
 *X*  X, zero or more times
 *X+  X, one or more times
 *X{n}    X, exactly n times
 *X{n,}   X, at least n times
 *X{n,m}  X, at least n but not more than m times
 *
 *Reluctant quantifiers
 *X?? X, once or not at all
 *X*? X, zero or more times
 *X+? X, one or more times
 *X{n}?   X, exactly n times
 *X{n,}?  X, at least n times
 *X{n,m}? X, at least n but not more than m times
 *
 *Possessive quantifiers
 *X?+ X, once or not at all
 *X*+ X, zero or more times
 *X++ X, one or more times
 *X{n}+   X, exactly n times
 *X{n,}+  X, at least n times
 *X{n,m}+ X, at least n but not more than m times
 *
 */
public class StringRegexTest {

	public static void main(String[] args) {
		String str = "abc     dfgt  fvv   kgmb      .     kalam    123";
		System.out.println(str.replaceAll("\\s", "")); // Output: abcdfgtfvvkgmb.kalam123
		System.out.println(str.replaceAll("\\s", " ")); // Output: abc     dfgt  fvv   kgmb      .     kalam    123
		System.out.println(str.replaceAll("\\s+", "")); // Output: abcdfgtfvvkgmb.kalam123
		System.out.println(str.replaceAll("\\s+", " ")); // Output: abc dfgt fvv kgmb . kalam 123
	}

}
