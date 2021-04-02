package practiceProject;

/* Longest common subsequence program using recursion*/

public class LongComSubRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String X = "abcder";
		String Y = "abgdkh";//abdh
		System.out.println(LCS(X,Y,X.length(),Y.length()));

	}
	
	public static int LCS(String X, String Y, int xsize, int ysize) {
		if(xsize==0||ysize==0) {
			return 0;
		}
		
		if(X.charAt(xsize-1)==Y.charAt(ysize-1)) {
			return 1 + LCS(X, Y, xsize-1, ysize-1);
		}else {
			return Math.max(LCS(X,Y,xsize, ysize-1), LCS(X,Y,xsize-1, ysize));
		}
	}

}
