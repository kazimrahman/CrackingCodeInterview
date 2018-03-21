class removeD{

	public static void main(String args[]){
		int[] a = {1,3,2,1,1,3,4,5,6,4,3};
		int n = a.length;
		int count = 0; 
		for(int i = 0; i < n-1;i++){
			for(int j = i+1; j < n; j++){
				if(a[i] == a[j]){
					a[j] =0;
					count++;
				}
			}
			System.out.println(a[i]);
		}
		int[] newA = new int[n-count];
		for(int i = 0; i < newA.length;i++){
			int j = i;
			if(a[i] != 0){
				j++;
			}
		}
	
	
	}

}