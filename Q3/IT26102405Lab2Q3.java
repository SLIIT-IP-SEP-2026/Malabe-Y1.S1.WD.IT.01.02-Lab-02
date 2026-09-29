public class IT26102405Lab2Q3 {
	
	public static void main(String[] args) {
	
	double sideA, sideB, hypotenuse;
	sideA = 3.0;
	sideB = 4;
	
	//hypotenuse = squareRoot(sideA ^ 2 + sideB ^ 2)
	hypotenuse = Math.pow((Math.pow(sideA, 2) + Math.pow(sideB, 2)), 0.5);
	System.out.println("Length of the hypotenuse: " + hypotenuse);
	
	}
}