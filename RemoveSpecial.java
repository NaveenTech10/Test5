package problems;

import java.util.HashMap;
import java.util.Map;

public class RemoveSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m = new  HashMap<Integer,String>();
		m.put(1, "Thermo)meter");
		m.put(2, "Fluctu%ation");
		m.put(3, "Eagl$e");
		m.put(4, "Pinp#oint");
		for(Map.Entry<Integer,String> mp:m.entrySet()) {
			Integer key =  mp.getKey();
			String value = mp.getValue();
			String modifiedValue = value.replaceAll("[!@#$%^&*()0]", "");
			m.put(key, modifiedValue);
		}
		System.out.print("After removing special character ==>");
		System.out.println(m);
	}
	}
