import java.util.ArrayList;
import java.util.List;

public class RecSort{
	public static void main(String a[]){
		List<Integer> numList = new ArrayList<Integer>(Arrays.asList(5,1,2,9,10,4));
		sort(numList);
		System.out.println(numList);
	}

	public static void sort(List<Integer> numList) {
		if(numList.size()==0) {
			return;
		}else {
			int temp = numList.get(numList.size()-1);
			numList.remove(numList.size()-1);
			sort(numList);
			insert(numList,temp);
		}
	}

	public static void insert(List<Integer> numList, int temp) {
		if(numList.size()==0||numList.get(numList.size()-1)<=temp) {
			numList.add(temp);
			return;
		}else {
			int val = numList.get(numList.size()-1);
			numList.remove(numList.size()-1);
			insert(numList,temp);
			numList.add(val);
			return;
		}
	}
}