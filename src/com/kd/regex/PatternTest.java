package com.kd.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * http://www.rexegg.com/regex-quickstart.html#ref
 * https://regexr.com/5q5er
 * https://www.java2novice.com/java-collections-and-util/regex/
 */
public class PatternTest {

	public static void main(String[] args) {

		//Date matches
		String regex = "\\d{4}-\\d{2}-\\d{2}";
		String value = "9999-22-22sdsd";
		System.out.println(getMatchList(regex, value));
		
		//Email matches 
		regex = "[a-zA-Z0-9_.-]+@[a-zA-Z0-9.-]+";
		value = "dfvfdfbgfbfg 24-12-2013 nwd  cnn wch kumar33.kd20333@gmail.com iwen h ec ijnecinie c ecinec 23-11-2023 kumar.kd20@gmail.com";
		System.out.println(getMatchList(regex, value));
		
		//[Email] matches 
		regex = "\\[[a-zA-Z0-9_.-]+@[a-zA-Z0-9.-]+\\]";
		value = "dfvfdfbgfbfg 24-12-2013 nwd  cnn wch [kumar33.kd20333@gmail.com] iwen h ec [ijnecinie] c ecinec 23-11-2023 kumar.kd20@gmail.com";
		System.out.println(getMatchList(regex, value));
		
		//find the id addresses from given string
		regex = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
		value = "dfvfdfbgfbfg 123.234.213.255 dfdgfg f454gn5";
		System.out.println(getMatchList(regex, value));
		
		//Replace multiple spaces with single space
		regex = "\\s+";
		String str = "This   is pattern   practice";
		String replace = " ";
		System.out.println(replaceWithPattern(regex, str, replace));
	
		//Check valid userName	
//		regex = "^[a-z0-9_-]+{4,200}$";
		regex = "[a-z0-9_-]+{4,16}";
		value = "my Name is 'kumar4_to', it is valid : ";
		System.out.println(value + isValidMatch(regex, "kumar4_to"));
		System.out.println(value + getMatchList(regex, value));
		
		//check valid password
		regex = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})";
		value = "my Name is 'Java2NOVICE$', it is valid : ";
		System.out.println(value + isValidMatch(regex, "Java2NOVICE$"));
	}
	
	//check pattern match in given input 
	public static boolean isValidMatch(String regex, String input) {
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches(); //if input is exact match
//		return matcher.find();  //if input contains any match
		
	}
	
	//find list of match in given string
	public static List<String> getMatchList(String regex, String value) {
		
		Pattern DATE_PATTERN = Pattern.compile(regex);
		Matcher match = DATE_PATTERN.matcher(value);
		List<String> matchValues = new ArrayList<>();
		while(match.find())
			matchValues.add(value.substring(match.start(0), match.end(0)));
		return matchValues;
		
	}
	
	//replace a pattern using regular expression
	public static String replaceWithPattern(String regex, String str,String replace){
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		return matcher.replaceAll(replace);
		
	}
}
