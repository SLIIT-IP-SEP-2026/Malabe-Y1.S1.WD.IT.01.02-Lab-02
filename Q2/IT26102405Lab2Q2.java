public class IT26102405Lab2Q2 {
	
	public static void main(String[] args){
	
		double perimeter, circumference, length, radius;
		
		length = 10.0;
		perimeter = 4 * length;
		
		//rope used to creare square fence is used again for circular fence
		circumference = perimeter;
		radius = circumference / (2 * 3.14);
		System.out.println("Radius of the circular fence: " + radius);
		
	}
}