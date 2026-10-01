public class IT26102714L2Q1 {
    public static void main(String[] args) {

        double perimeter = 100;
        double width;
        double length;

        width = (3.0 / 4.0) * (perimeter / 3.5);
        length = perimeter / 2 - width;

        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);
    }
}