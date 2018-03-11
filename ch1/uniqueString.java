import java.util.*;


class uniqueString{
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String ent = sc.nextLine();
		boolean unique = isUnique(ent);
		
		System.out.println("The string is unique? " + unique);
		
	}
	
	public static boolean isUnique(String sent){
		sent = sent.replaceAll("\\s+","");
		int n = sent.length();
		boolean [] check = new boolean[256];
		for(int i = 0; i < n; i++){
			int val = sent.charAt(i);
			if(check[val] == true){
				return false;
			}else{check[val] = true;}
			
			
		}
		
		//System.out.println(n);
		return true;
	}
	
	
	
}