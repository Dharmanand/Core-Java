package com.kd.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class EleminateDuplicateElementFromArray {

	public static void main(String[] args) {

		int[] a = { 2, 2, 3, 8, 8, 2, 9, 6 };

		System.out.println(Arrays.toString(removeDuplicateEntryUsingCollection(a)));
		System.out.println(Arrays.toString(removeDuplicates(a)));

	}

	public static int[] removeDuplicateEntryUsingCollection(int[] a) {
		Object[] b = Arrays.stream(a).boxed().toArray(); // Convert int array to Object array.
		Set<Object> set = new HashSet<>(Arrays.asList(b)); // Convert Object array to List<Object> to Set<Object>.
		
		// Convert Set<Object> to int[];
		int[] ints = set.stream()
				.map(s -> (Integer)s)
				.collect(Collectors.toSet()).stream().mapToInt(Integer :: intValue).toArray();
		return ints;
	}

	public static int[] removeDuplicates(int[] a) {
	    int[] output = new int[a.length];
	    int count = 0;
	    int num = 0;

	    //Iterate over an array
	    for(int i=0; i<a.length; i++)
	    {
	        num=a[i];
	        boolean flag = check(output,num);
	        if(flag==false)
	        {
	            output[count]=num;
	            ++count;
	        }
	        System.out.println(count);
	    }
	    return Arrays.copyOf(output, count);
	}
	
	public static boolean check(int[] arr, int num)
	{
	    boolean flag = false;
	    for(int i=0;i<arr.length; i++)
	    {
	        if(arr[i]==num)
	        {
	            flag = true;
	            break;
	        }
	    }
	    return flag;
	}
	
}
