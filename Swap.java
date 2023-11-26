package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
//		INITIALIZE THE LIST ELEMENTS....
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.print("THE LIST ELEMENTS ARE==>");
		System.out.println(list);
		Collections.swap(list, 1, 2);
		System.out.print("THE LIST ELEMENTS ARE==>");
		System.out.println(list);

	/*	ArrayList<Integer> list=new ArrayList<Integer>();
//		INITIALIZE THE LIST ELEMENTS....
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.print("THE LIST ELEMENTS ARE==>");
//		PRINT THE LIST ELEMENTS
		System.out.println(list);
//		DECLARE THE OBJECT ARRAY AND STORE THE LIST ELEMENTS:
		Object[] arr=new Object [list.size()];
		arr=list.toArray();	
		System.out.print("THE ARRAY ELEMENTS ARE==>");
//		PRINT THE ARRAY ELEMENTS 
		System.out.println(Arrays.toString(arr));
		Scanner input=new Scanner(System.in);
		System.out.println("CHOOSE AN SWAP INDEX IN ARRAY ");
		//INDEX VALUE ...
		int indexOne=input.nextInt();
		int indexTwo=input.nextInt();
//		CALL THE FUNCTION .
		swap(indexOne,indexTwo,arr);
		System.out.print("AFTER SWAPPING AN ARRAY==>");
//		AFTER SWAPPING THE ARRAY ELEMENTS ARE...
		System.out.println(Arrays.toString(arr));
		System.out.println("STORE THE ELEMENT IN A LIST  ..");
//		STORE THE ARRAY ELEMENTS IN A LIST 
		ArrayList<Integer> modifiedList=new ArrayList<>();
		for(Object element :arr) {
			modifiedList.add((Integer)element);
	}
//		Clear the list elements ...
		System.out.println("CLEAR THE ELEMENTS IN LIST ");
		list.clear();
		System.out.println(list);
//		Add the modifiedList elements in a list...
		list.addAll(modifiedList);
		System.out.print("UPDATED LIST==>");
		System.out.println(list);
	}

	private static void swap(int indexOne, int indexTwo, Object[] arr) {
		// TODO Auto-generated method stub
		
			if(indexOne>=0&&indexOne<arr.length&&indexTwo>=0&&indexTwo<arr.length) {
				Object temp=arr[indexOne];
				arr[indexOne]=arr[indexTwo];
				arr[indexTwo]=temp;
			
			}
			else {
				System.out.println("INVALID INDEX");
		}
		}

}
*/
	}
}