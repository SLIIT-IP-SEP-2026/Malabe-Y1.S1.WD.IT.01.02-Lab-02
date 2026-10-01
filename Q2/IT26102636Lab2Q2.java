public class IT26102636Lab2Q2{
       public static void main (String[] args)
	   {
	      
		  //given side length of the squre fence
		  double sideLength=10.0;
		  
		  //Calculate the perimeter of the squre fence
		  double perimeterSquare=4*sideLength;// 4*length
		  
		  //Calculate the radius of the circuler fence maining the same perimeter
		  //4*length-2*PI*radius
		  
		  //radius = (4*length/2*PI)
		  double radius= perimeterSquare/(2*3.14);
		  
		  //output the calculated radius
		  System.out.println("Radius of the squre fence"+radius);
	   
	    }
}