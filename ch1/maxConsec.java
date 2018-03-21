

class maxConsec{
	public static void main(String args[]){
		int[] arr = {1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1};	
		int num  = maxCon(arr);
		System.out.println(num);
	}

	public static int maxCon(int[] a){
		int count = 0;
		int n = a.length;
		int max[] = new int[n];
		
		for(int i = 0; i < n; i++){
			if(a[i] == 1){
				count++;
			}else{
				max[i] = count;
				count = 0;
			}
			max[i] = count;
		}
		
		int maxx = max[0];
		for(int i = 1; i < n; i++){
			if(maxx<max[i]){
				maxx = max[i];
			}
		}
		
		count = maxx;
		
		return count;
	}
}
