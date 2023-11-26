package problems;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		widening --implicit...
		int num=10;
		float number=num;
		System.out.println("IMPLICIT::WIDENING");
		System.out.println(number);
		int value=(int)number;
		System.out.println("EXPLICIT::NARROWING ");
		System.out.println(value);
		String no="1847254.412132131";
		double doubleValue = Double.parseDouble(no);
		int valueOne=(int)doubleValue;
		System.out.println(valueOne);
	}

}
