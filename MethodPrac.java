package practise;

public class MethodPrac {

	
	public static void main(String[] args) {
		System.out.println(add(2,2,2));

		
	}
	public static double add(double x, double y) {
		return x+y;
	}
	public static double add(double x, double y,double z) { // overloaded  methods, same name , but diff params
		return x+y+z;
	}
	
	
	
	
}
