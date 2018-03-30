import java.util.*;

class palinPerm{

	public static void main(String args[]){
	
	String a = "tact coa";
	
	System.out.println(check(a));
	
	}
	
	static boolean check(String ab){
		int spaces = 0;
		for(int i = 0; i < ab.length();i++){
			if(ab.charAt(i)==' '){
				spaces++;
			}
		}
		int newL = ab.length()-spaces;
		char[] b = new char[newL];
		int j = 0;
		for(int i = 0; i < ab.length();i++){
			
			if(ab.charAt(i)!=' '){
				b[j] = ab.charAt(i);
				j++;
			}
		}
		
		//for(int i = 
		
		
		System.out.println(Arrays.toString(b));

		return true;
	}

}