package ch1_ArraysAndStrings;
/*Write a method to replace all spaces in a string with'%20'. You may assume that the string has sufficient space at the end of the string 
 * to hold the additional characters, and that you are given the "true" length of the string. 
 * (Note: if imple- menting in Java, please use a character array so that you can perform this opera- tion in place.)
 */
public class Problem1_4 {
	public static String replacingEmptySpace(String s){
	s=s.replace(" ", "%20");
	return s;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String: Mr John Smith\n"+ "New String: "+ Problem1_4.replacingEmptySpace("Mr John Smith"));
	}

}
