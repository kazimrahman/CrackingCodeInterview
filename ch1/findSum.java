import java.util.*;
class findSum{
	
	//given an array, find the two numbers that return the sum specified
	public static void main(String args[]){
		
		int a[] = {10,4540,12,36,13,34,45,44};
		
		//boolean n = find(a, 170);
		boolean d = find(a,25,true);
		System.out.println(d);
	}
	
	static boolean find(int[] a, int sum){
		for(int i = 0; i < a.length-1;i++){
			int j = i+1;
			if(a[i]+a[j]== sum){
				return true;
			}
		}
		return false;
	}
	
	//uses hashmap, theoretically faster
	static boolean find(int[] a, int sum, boolean v){
		List list = new ArrayList<Integer>();
		Map map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < a.length;i++){
			map.put(i, a[i]);
		}
		System.out.println(map.get(0));
		for(int i = 0; i < a.length; i++){
			//list.get(i);
			int r = sum - (int)map.get(i);
			System.out.println(r);
			if(map.containsValue(r)){
				return true;
			}
		}
		return false;
		
	}


}
