package practiceProject;

public class SubsetSumDP {

	public static void main(String[] args) {
		int set[] = {3, 34, 4, 12, 5, 2};
		int sum = 17;
		boolean t[][] = new boolean[set.length+1][sum+1];
		
		for(int i = 0;i<set.length;i++) {
			for(int j = 0;j<sum+1;j++) {
				if(i==0) {
					t[i][j] = false;
				}
				
				if(j==0) {
					t[i][j] = true;
				}
			}
		}
		
		for(int k = 1;k<set.length+1;k++) {
			for(int l = 1;l<sum+1;l++) {
				if(set[k-1]<=l) {
					t[k][l] = t[k-1][l-set[k-1]]||t[k-1][l];
				}else {
					t[k][l] = t[k-1][l];
				}
			}
		}
		
		System.out.println(t[set.length][sum]);
	}
}
