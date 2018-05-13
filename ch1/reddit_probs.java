import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class reddit_probs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr = {8,7,-6,-5,-4,-3,2,1,2,1};
		System.out.println(freqIntMap(arr));
		int[] b = arr.clone();
		selectSort(b);
		System.out.println(Arrays.toString(b));
		System.out.println(freqIntSort(arr));
		System.out.println();
		System.out.println(largestSum(arr));

	}
	
	static int freqIntMap(int[] arr){
		Map map = new HashMap<>();

		//populate hashmap with counts of ints
		for(int i = 0; i < arr.length; i++){
			if(map.get(arr[i]) ==null){
				map.put(arr[i], 1);
		}else{
			map.put(arr[i], ((int)map.get(arr[i]) + 1));
		}
		}

		int max = (int)map.get(arr[0]);
		int num = -1;
		for(int i = 1; i < arr.length; i++){
			if(max < (int)map.get(arr[i])){
				num = arr[i];
			}
		}
		return num;
	}
	
	static int freqIntSort(int[] arr){
		selectSort(arr);
		int count = 0;
		int max = 0;
		int num = 0;
		for(int i = 0; i < arr.length-1; i++){
			
			if(arr[i] == arr[i+1]){
				count++;
			}else{
				if(count > max){
					max = count;
					num = arr[i];
				}
				count = 0;
			}
			System.out.println(count);
		}
		return num;
		
	}
	
	static void selectSort(int[] arr){
		
		for(int i = 0; i < arr.length; i++){
			int min_i = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[min_i] > arr[j]){
					min_i = j;
				}
			}
			int temp = arr[min_i];
			arr[min_i] = arr[i];
			arr[i] = temp;
		}
		return;
	}
	static int largestSum(int[] a){
		if(a.length == 0){
			return 0;
		}
		int curr = a[0];
		int max = a[0];
		for(int i = 1; i < a.length; i++){
			int newcur = curr + a[i];
			if(newcur>curr){
				curr = newcur;
			}
			if(curr > max){
				max = curr;
			}
		}
		return max;
	}
}