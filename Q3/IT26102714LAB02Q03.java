public class IT26102714Lab02Q03 {
    public static void main(String[] args) {

        double sideA = 3;
        double sideB = 4;

        double hypotenuse = Math.sqrt(
            (sideA * sideA) + (sideB * sideB)
        );

        System.out.println("Length of the hypotenuse: " + hypotenuse);
    }
}