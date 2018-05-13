/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class allSubsets
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Integer[] arr = {1,2,3,4};
		subs(arr);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = sc.nextLine();
		longestUniqueSubstring(s);
	}
	
	static void subs(Integer[] given){
	    Integer[] subset = new Integer[given.length];
	    helper(given, subset, 0);
	}
	
	static void helper(Integer[] given, Integer[] sub, int i){
	    if(i == given.length){
	        //System.out.println(Arrays.toString(sub));
			return;
	    }else{
	        sub[i] = given[i];
	        helper(given, sub, i+1);
	        sub[i] = null;
	        helper(given, sub, i+1);
	    }
	}
	
	public static ArrayList<String> longestUniqueSubstring(String s){
		ArrayList<String> subs = allSubstrings(s);
		ArrayList<String> unique = new ArrayList<String>();
		int maxlen = 0;
		int currlen = 0;
		Map m = new HashMap<String, Integer>();
		for(String n : (ArrayList<String>)subs){
			if(isUnique(n)){
				unique.add(n);
				//System.out.println(n);
				currlen = n.length();
				if(currlen > maxlen){
					maxlen = currlen;
				}
				m.put(n, currlen);
			}
		}
		Iterator it = m.keySet().iterator();
		//for(String n : (String)m.keySet()){
		while(it.hasNext()){
			String a = (String)it.next();
			if((int)m.get(a) == maxlen){
				unique.add(a);
				System.out.println(a);
			}
		}
		
		
		return unique;
		
	}
	
	public static ArrayList<String> allSubstrings(String s){
		ArrayList al = new ArrayList<String>();
		for(int i = 0; i < s.length(); i++){
			for(int end = i+1; end <= s.length(); end++){
				al.add(s.substring(i, end));
			}
		}
		return al;
	}
	
	static boolean isUnique(String s){
		for(int i = 0; i < s.length(); i++){
			for(int j = i+1; j< s.length(); j++){
				if(s.charAt(i) == s.charAt(j)){
					return false;
				}
			}
		}
		return true;
	}
}
