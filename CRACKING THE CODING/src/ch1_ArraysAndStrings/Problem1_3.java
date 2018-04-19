package ch1_ArraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//PROBLEM 1.3:	Given two strings, write a method to decide if one is a permutation of the other
public class Problem1_3 {

	// this is not a working method, I tried to implement the HashMap but didn't work at the end
	public static boolean usingHashMap(String s1, String s2){
		Map<Character, Integer> permutation = new HashMap <>();
		char[] b1=s1.toCharArray();
		char[] b2=s2.toCharArray();
		for (char c : b1){
			if (permutation.containsKey(c)){
				permutation.put(c, permutation.get(c)-1);
			}else{
				permutation.put(c, 1);
			}
		}
		int value = permutation.hashCode();
		if(value!=0) return false;
		return true;
	}
	
	public static boolean isPermutation(String s1, String s2){
	if(s1.length()!=s2.length()) return false;
	char [] a1 = s1.toCharArray();
	char [] a2 = s2.toCharArray();
	Arrays.sort(a1);
	Arrays.sort(a2);
	return Arrays.equals(a1, a2);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String1 and String2 are permutations?: "+ Problem1_3.isPermutation("cat","tac"));
		System.out.println("String1 and String2 are permutations?: "+ Problem1_3.usingHashMap("cat","tac"));
		
		
	}

}
