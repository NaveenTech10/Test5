package problems;

import java.util.Iterator;
import java.util.PriorityQueue;

public class IterateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq=new PriorityQueue();
		pq.add("Naveen");
		pq.add("Thilip");
		pq.add("Pope");
		pq.add("Siva");
		System.out.print("THE QUEUE ELEMENTS ARE==>");
		System.out.println(pq);
		Iterator itr=pq.iterator();
		System.out.println("ITERATING THE QUEUE ELEMENTS ARE....");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
