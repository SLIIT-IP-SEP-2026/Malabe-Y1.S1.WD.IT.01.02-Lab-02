public class IT26102410Lab2Q3 {
public static void main(String[]args) {
//given lengths of two sides of triangle

double sideA=3.0;
double sideB=4.0;
//calculate the hypotenuse using pythogoras theorem
//Hypotenuse = square root (SideA2 + SideB2)

double hypotenuse;
hypotenuse = Math.sqrt((sideA*sideA)+ (sideB*sideB));
System.out.println("length of the hypotenuse:"+hypotenuse);
}
}
