import java.io.*;
import java.util.*;

public class reverseStringRecursive{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String shyza = in.nextLine();
	//	char[] newA = shyza.length();
		String rev = reverse(shyza);
		System.out.println(rev);
	}

	public static String reverse(String word){
		if(word.length() == 0){return word;}
		else{
		return reverse(word.substring(1)) + word.charAt(0);
		}

	}



}
