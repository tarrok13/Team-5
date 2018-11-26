import java.util.Collections;
import java.util.Vector;

public class ArrayCount {
	public void Most_Repeted_Value(int[]arr) {

		//int[] arr = {3, 5, 5, 5, 3, 3, 3};
		Vector<Integer> Numbers = new Vector<>();
		Vector<Integer> Counts = new Vector<>();
		int C = 0;
		for (int i = 0; i < arr.length; i++) {
			if (Numbers.contains(arr[i])){
				i++;
			} else {
				Numbers.add(arr[i]);
				C++;
			}
			/***************************************/
			for (int k = i; k < arr.length - 1; k++) {
				if (arr[i] == arr[k + 1]) {

					C++;
				} else {
					continue;
				}
			}
			Counts.add(C);
			C = 0;
			/******************************************/
		}
		int Index = 0;
		Object obj = Collections.max(Counts);
		Index = Counts.indexOf(obj);
		System.out.println("The Most Repeted Value = " + Numbers.get(Index));
		System.out.println("Its Count = " + Counts.get(Index));
	}


	public static void main(String[] args) {


	}
}





