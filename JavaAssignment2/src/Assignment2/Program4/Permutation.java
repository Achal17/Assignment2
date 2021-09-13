//Java Program to find all the permutations of a string

package Assignment2.Program4;

import java.util.Arrays;

public class Permutation {
	public void permutation(String str, String ans) {
		if(str.length()==0) {
			System.out.println(ans + " ");
			return;
		}
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		//System.out.println(arr);
		
		for(int i=0;i<str.length();i++) {
			char ch  = str.charAt(i);
			String res = str.substring(0, i)+str.substring(i+1);
			permutation(res,ans+ch);
		}
		
	}
}
