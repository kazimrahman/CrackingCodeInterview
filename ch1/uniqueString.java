import java.util.*;


class uniqueString{
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String ent = sc.nextLine();
		
		long startTime = System.nanoTime();
		
		boolean unique = isUnique(ent);
		
		long endTime = System.nanoTime();
		long durationNoExtra = (endTime - startTime);
		
		System.out.println(durationNoExtra);
		
		
		long startTime1 = System.nanoTime();
		//longer??
		boolean lol = uniqueNoDataStructure(ent);
		long endTime1 = System.nanoTime();
		long durationExtra = (endTime1 - startTime1);
		System.out.println("no extra struct "+durationExtra);
		
		System.out.println("The string is unique? " + unique + " " + lol);
		
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
	
	public static boolean uniqueNoDataStructure(String ent){
		ent = ent.replaceAll("\\s","");
		for(int i = 0; i < ent.length(); i++){
			for(int j =  i+1; j < ent.length(); j++){
				if(ent.charAt(i) == ent.charAt(j)){
					return false;
				}
			}
		}
		return true;
		
	}
	
	
	
}