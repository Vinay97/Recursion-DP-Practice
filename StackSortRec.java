import java.util.Stack;

public class StackSortRec{
	public static void main(String a[]){
		Stack<Integer> numList = new Stack<Integer>();
		numList.push(10);
		numList.push(5);
		numList.push(6);
		numList.push(2);
		numList.push(1);
		numList.push(3);

		System.out.println(numList);
		sort(numList);
		System.out.println(numList);
	}

		public static void sort(Stack<Integer> numList) {
		if(numList.size()==0) {
			return;
		}else {
			int temp = numList.pop();
			sort(numList);
			insert(numList,temp);
		}
	}

	public static void insert(Stack<Integer> numList, int temp) {
		if(numList.size()==0||numList.peek()<=temp) {
			numList.push(temp);
			return;
		}else {
			int val = numList.pop();
			insert(numList,temp);
			numList.add(val);
			return;
		}
	}
}