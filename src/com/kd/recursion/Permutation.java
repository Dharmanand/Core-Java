package com.kd.recursion;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.LongStream;

public class Permutation {

	public static void main(String[] args)
    {
		Set<String> set = new HashSet<>();
        String str = "ABCDEFFH";
        int n = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(set, str, 0, n-1);
        long factorial = LongStream.rangeClosed(1, n).reduce(1, (long x, long y) -> x * y);
        System.out.println("No of permutations: "+factorial);
        System.out.println("Set Size: "+set.size());
    }
 
    /**
    * permutation function
    * @param str string to calculate permutation for
    * @param set contains all permutation strings
    * @param l starting index
    * @param r end index
    */
    private void permute(Set<String> set, String str, int l, int r)
    {
        if (l == r)
        	set.add(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(set, str, l+1, r);
//                str = swap(str,l,i);
            }
        }
    }
 
    /**
    * Swap Characters at position
    * @param a string value
    * @param i position 1
    * @param j position 2
    * @return swapped string
    */
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
