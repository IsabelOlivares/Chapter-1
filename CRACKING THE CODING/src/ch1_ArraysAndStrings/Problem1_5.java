package ch1_ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

/*Implement a method to perform basic string compression using the counts of repeated characters. 
 * For example, the string aabcccccaaa would become a2blc5a3. 
 * If the "compressed" string would not become smaller than the orig- inal string, your method should return the original string.
 */
public class Problem1_5 {
	
	private static String countingChar(String s){
	String s2=null;
	Map<Character,Integer> map= new HashMap<>();
	char[]characters=s.toCharArray();
	for(char c:characters){
		if(map.containsKey(c)){
			map.put(c, map.get(c)+1);
		}else{
			map.put(c, 1);
		}
	
	}
	return s2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String1: aabcccccdd\n"+ Problem1_5.countingChar("aabcccccdd"));

	}

}
