package ch1_ArraysAndStrings;

//PROBLEM 1.1:	Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

public class Problem1_1 {
	boolean [] set=new boolean [128];
	int ascii;
	public boolean UniqueChar(String s){
		if (s.length()>128) return false;
		for(int i=0; i<s.length(); i++){
			ascii=s.charAt(i);
			if(set[ascii]) return false;
		}
		set[ascii]=true;
	return true;
	}
	
}
//coments below
