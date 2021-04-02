package practiceProject;

public class LongComSubBU {
	
	/* Longest common subsequence program using bottom-up approach (dynamic programming)*/
	
	static int tp[][] = new int[1001][1001];
	
	static {
		for(int i = 0;i<1001;i++) {
			for(int j = 0;j<1001;j++) {
				tp[i][j] = -1;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String X = "abcdeh";
		String Y = "abgdkh";//abdh
		System.out.println(LCS(X,Y,X.length(),Y.length()));
	}
	
	public static int LCS(String X, String Y, int xsize, int ysize) {
		if(xsize==0||ysize==0) {
			return 0;
		}
		
		if(tp[xsize][ysize]!=-1) {
			return tp[xsize][ysize];
		}else {
			if(X.charAt(xsize-1)==Y.charAt(ysize-1)) {
				tp[xsize][ysize] = 1 + LCS(X, Y, xsize-1, ysize-1);
			}else {
				tp[xsize][ysize] = Math.max(LCS(X,Y,xsize, ysize-1), LCS(X,Y,xsize-1, ysize));
			}
		}
		
		return tp[xsize][ysize];
	}
	
}
