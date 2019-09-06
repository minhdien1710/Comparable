import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        CompareCircle[] circles = new CompareCircle[3];
        circles[0] = new CompareCircle(3);
        circles[1] = new CompareCircle(7);
        circles[2] = new CompareCircle(5);
        System.out.println("Pre-sorted:");
        for (CompareCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (CompareCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
