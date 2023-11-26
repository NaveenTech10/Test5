package problems;

import java.util.HashMap;

public class MapCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap mapOne=new HashMap();
		mapOne.put(1,"Naveen");
		mapOne.put(2,"Thilip");
		mapOne.put(3,"Pope");
		mapOne.put(4,"Siva");
		System.out.println(mapOne);
		System.out.println("Copy of the elements ");
		HashMap mapTwo=new HashMap();
		mapTwo.putAll(mapOne);
		for(int i=1;i<=mapTwo.size();i++) {
			System.out.println(mapTwo.get(i));
		}
	}

}
