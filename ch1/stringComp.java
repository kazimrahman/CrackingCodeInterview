
class stringComp{
	
	public static void main(String[] args){
	
		String b = "aaabbcccccd";
		
		String c = compress(b);
	}
	
	static String compress(String a){
		
		int i = 0;
		
		while(i < a.length()-1){
			int count = 1;
			int j = i;
			while(a.charAt(i) == a.charAt(j+1)){
				count++;
				j++;
			}
			i = j+1;
			System.out.println(count);
		}
		
		
		
		return a;
	}

}
