package practiceProject;

public class LongPalindromeSS {
	
	/*  Longest Palindromic Subsequence */
	
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
		
		String a = "agbcba";
		StringBuilder sb = new StringBuilder(a);
		String b = sb.reverse().toString();
		
		LCS(a, b, a.length(), b.length());
		
		int i = a.length();
		int j = b.length();
		String s = "";
		while(i>0 && j>0) {
			if(a.charAt(i-1)==b.charAt(j-1)) {
				s += a.charAt(i-1);
				i--;
				j--;
			}else {
				if(tp[i-1][j]>tp[i][j-1]) {
					i--;
				}else {
					j--;
				}
			}
		}
		
		StringBuilder sb2 = new StringBuilder(s);
		System.out.println(sb2.reverse().toString());

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
