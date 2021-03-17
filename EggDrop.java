public class EggDrop {
	public static void main(String[] args) {
		System.out.println("Minimum Trials "+solve(2, 10));
	}
	
	static int solve(int egg, int floors) {
		if(floors==0||floors==1) {
			return floors;
		}
		
		if(egg==1) {
			return floors;
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int i = 1;i<=floors;i++) {
			int temp = 1+Math.max(solve(egg-1,i-1), solve(egg,floors-i));
			min = Math.min(min, temp);
		}
		return min;
	}

}
