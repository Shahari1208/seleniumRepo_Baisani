package week2.day4_assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindFirstMissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
				int[] arr = {1,2,3,4,7,6,8};

				// Sort the array	
				
				List<Integer> list1 = new ArrayList<Integer>();
				for(int i=0;i<arr.length;i++)
				{
					list1.add(arr[i]);
				}
				
				Collections.sort(list1);
				
				System.out.println("Sorted List "+list1);
				for(int i=0;i<list1.size()-1;i++)
				{
					if(list1.get(i)!=list1.get(i+1))
					{
						System.out.println("Missing element "+list1.get(i+1));
					}
				}
				

				// loop through the array (start i from arr[0] till the length of the array)

					// check if the iterator variable is not equal to the array values respectively
					
						// print the number
						
						// once printed break the iteration

	}

}
