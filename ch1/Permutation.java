import java.util.*;
import java.io.*;

class Permutation{

	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		String jav = "";
		Random rand = new Random();
	
		try{
			Scanner in = new Scanner(new File("./words.txt"));
			while(in.hasNextLine()){
				list.add(in.nextLine());
			}
		}catch(Exception e){
			System.out.println(e);
		}
		
		jav = list.get(rand.nextInt(list.size())+1);
		
		System.out.println("Give a permutation of the word "+jav);
		
		String boom = sc.nextLine();
		
		char b = 'b';
		int ba = (int)b;
		char c = (char)ba;
		boolean ti = isP(jav,boom);
		
		while (!ti){
			System.out.println("Not a permutation of the word "+jav);
			System.out.println("Try again or quit by pressing 'n'");
			String boom2 = sc.nextLine();
				if(boom2.equals("n")){
					System.exit(0);
				}
			ti = isP(jav,boom2);
		}
		
		System.out.println("Nice!");
		
	}
	
	
	public static boolean isP(String s1, String s2){
		if(s1.length() != s2.length()) return false;
		
		int n = s1.length();
		
		char check1[] = s1.toCharArray();
		char check2[] = s2.toCharArray();
		
		for(int i = 0; i < n - 1; i++){
			int min_i = i;
			for(int j = i; j < n; j ++){
				if(check1[min_i] > check1[j]){
					min_i = j;
				}
			}
			char temp = check1[min_i];
			check1[min_i] = check1[i];
			check1[i] = temp;
		}
		
		for(int i = 0; i < n - 1; i++){
			int min_i = i;
			for(int j = i; j < n; j ++){
				if(check2[min_i] > check2[j]){
					min_i = j;
				}
			}
			char temp = check2[min_i];
			check2[min_i] = check2[i];
			check2[i] = temp;
		}
		
		return Arrays.equals(check1, check2);
	}
	

}
