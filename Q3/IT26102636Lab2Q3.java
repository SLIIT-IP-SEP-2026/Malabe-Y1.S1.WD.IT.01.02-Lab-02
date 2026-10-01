public class IT26102636Lab2Q3
{

    public static void main (String[] args)
	{
	
	  //Given lengths of two legs of the right triangle
	  
	  double sideA=3.0;
	  double sideB=4.0;
	  
	  //Calculate the lengthof the  hypotenuse  using the Phythagorean theoren
	  //c=squareroot(sideA^2+sideB^2)
	  double hypotenuse= Math.sqrt(sideA*sideA+sideB*sideB);
	  
	  //Output the calculated hypotenuse
	  System.out.println("Length of the hypotenuse" +hypotenuse);

    }
}