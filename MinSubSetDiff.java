package practiceProject;

import java.util.ArrayList;
import java.util.List;

public class MinSubSetDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,7};//{3, 1, 4, 2, 2, 1};
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum +=arr[i];
		}
		System.out.println(sum);
		System.out.println(minSubSet(arr, 0, sum));
	}
	
	public static int minSubSet(int arr[], int s1, int s2) {
		List<Integer> sortList = subsetSum(arr, s2);
		
		int min = Integer.MAX_VALUE;
		for(Integer i:sortList) {
			min = Math.min(min, s2-2*i);
		}
		
		return min;
	}
	
	public static List<Integer> subsetSum(int arr[], int range) {
		boolean tp[][] = new boolean[arr.length+1][range+1];
		
		for(int i = 0;i<arr.length+1;i++) {
			for(int j = 0;j<range+1;j++) {
				if(i==0) {
					tp[i][j] = false;
				}
				
				if(j==0) {
					tp[i][j] = true;
				}
			}
		}
		
		for(int i = 1;i<arr.length+1;i++) {
			for(int j = 1;j<range+1;j++) {
				if(arr[i-1]<=j) {
					tp[i][j] = tp[i-1][j-arr[i-1]] || tp[i-1][j];
				}else {
					tp[i][j] = tp[i-1][j];
				}
			}
		}
		
		List<Integer> sortList = new ArrayList<>();
		for(int i = arr.length;i<arr.length+1;i++) {
			for(int j = 0;j<=range/2;j++) {
				if(tp[i][j]) {
					sortList.add(j);
				}
			}
		}
		
		return sortList;
	}

}
