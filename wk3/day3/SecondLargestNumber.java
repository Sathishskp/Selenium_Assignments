package wk3.day3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {3, 2, 11, 4, 6, 7};
		
		List<Integer> numList = new ArrayList<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			numList.add(num[i]);
		}
		System.out.println(numList);
		Collections.sort(numList);
		System.out.println(numList);
		
		System.out.println(numList.get(numList.size()-2));
	}

}
