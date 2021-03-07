import java.util.Stack;
public class StackRevRec{
	public static void main(String a[]){
		Stack<Integer> numList = new Stack<Integer>();
		numList.push(10);
		numList.push(5);
		numList.push(6);
		numList.push(2);
		numList.push(1);
		numList.push(3);
		
	
		System.out.println(numList);
		reverse(numList);
		System.out.println(numList);
	}

	public static void reverse(Stack<Integer> numList) {
		if(numList.size()==1) {
			return;
		}else {
			int temp = numList.pop();
			reverse(numList);
			insert(numList,temp);
		}
	}

	public static void insert(Stack<Integer> numList, int temp) {
		if(numList.size()==0) {
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