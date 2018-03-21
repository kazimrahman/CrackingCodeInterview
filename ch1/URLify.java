import java.util.*;

class URLify{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String parse = "Mr John Smith    ";
		int space = 13;
		
		String newParse = urlify(parse, space);
		System.out.println(newParse);
		
		
	}
	
	public static String urlify(String a, int b){
		char[] toDo = a.toCharArray();
		int n = b;
		int spaces = 0;
		
		for(int i = 0; i < b; i++){
			if(toDo[i]==' '){
				spaces += 1;
			}
		}
		int newB = b + (spaces*2);
		//System.out.println(n);
		for(int i = n-1; i >=0; i--){
			if(toDo[i] == ' '){
				toDo[newB-1] = '0';
				toDo[newB-2] = '2';
				toDo[newB-3] = '%';
				newB -= 3;
			}else{
				//System.out.println(toDo[newB]);
				toDo[newB-1] = toDo[i];
				newB--;
			}
		}
		
		
		String newA = new String(toDo);
		
		
		return newA;
	}


}
