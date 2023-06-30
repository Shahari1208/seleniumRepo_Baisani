package week2.day4_assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
		int[] data = {3,2,11,4,6,7};

		/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
		 */


		List<Integer> list1 = new ArrayList<Integer>();
		for(int i =0;i<data.length;i++)
		{
			list1.add(data[i]);
		}

		System.out.println("List data: "+list1);
		Collections.sort(list1);
		System.out.println("Sorted List: "+list1);

		for (int j=0;j<list1.size();j++)
		{
			System.out.println("Second largest number in the list "+list1.get((list1.size()-2)));
			break;
		}


	}

}
