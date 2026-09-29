public class IT26102405Lab2Q1 {

	public static void main(String[] args){
	
		double perimeter = 100.0;
		double length, width;
		
		// perimeter = length * (1 + 1 + 3/4 + 3/4)
		//perimeter = length * 14/4
		length = 4.0 * perimeter / 14.0;
		width = 3.0 * length / 4.0;
		
		System.out.println("Lenght of the fence: " + length);
		System.out.println("Width of the fence: " + width);
	}
}