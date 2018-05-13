//Write a function to calculate x^a with x and a as parameters. Write it recursively  
import java.util.*;
class power{
	public static void main(String args[]){
		
		int[] a = {2,3,4,5,67,8,9,2,3};
		System.out.println(powR(2,5));
		System.out.println(findRecur(a));
	
	
	}
	
	static int powR(int x, int a){
		if(a == 0){return 1;}
		
		return x * powR(x, a-1);
	
	}
	
	static int findRecur(int[] arr){
		Map m = new HashMap();
		
		for(int i = 0; i < arr.length; i++){
			if(m.get(arr[i]) == null){
				m.put(arr[i], 1);
			}else{
				return arr[i];
			}
		}
		return -1;
	}


}