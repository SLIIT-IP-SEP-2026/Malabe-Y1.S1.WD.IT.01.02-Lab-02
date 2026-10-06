public class IT26102000Lab2Q3 {

   public static void main (String[] args){
   
   //calculate the length of the hypotenuse of a right triangle when two other sides are known
     double sideA,sideB,hypotenuse;
	  sideA = 3.0;
	  sideB = 4.0;
	  
   //Hypotenuse = square root (sideA^2 + sideB^2)
      hypotenuse = Math.sqrt(sideA*sideA + sideB*sideB);
	   
	   System.out.print("Hypotenuse of a right triangle = "+hypotenuse);
   
   
   }
}