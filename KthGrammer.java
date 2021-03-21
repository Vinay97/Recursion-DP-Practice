package practiceProject;

public class KthGrammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(2,1));
	}
	
	public static int solve(int N, int K) {
		if(N == 1&& K == 1) {
			return 0;
		}
		
		int mid  = (int) Math.pow(2, N-1);
		
		if(K<=mid) {
			return solve(N-1,K);
		}else {
			return solve(N-1, K-mid)==0?1:0;
		}
	}

}
