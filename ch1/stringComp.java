import java.util.*;

class stringComp{
	public static void main(String[] args){
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter string to compress");
		String b = in.nextLine();
		
		char c = 'c' + 3;
		
		//int b = 99;
		//System.out.println(c);
		
		
		System.out.println(compress(b));
		System.out.println(concat(b));
		
	}
	
	static String compress(String a){
		
		int count = 0;
		StringBuilder s = new StringBuilder("");
		
		for(int i = 0; i < a.length(); i++){
			count++;
			if(i+1 >= a.length() || a.charAt(i) != a.charAt(i+1)){
				s.append(a.charAt(i));
				s.append(count);
				count = 0;
			}
		}
		
		return (a.length() > s.length()) ? (s.toString()) : (a);
		
		//return a;
	}
	
	static String concat(String a){
		if(a == null || a.length() <= 1){return a;}
		return concat(a.substring(1,a.length())) + a.charAt(0); 
		
	}

}
