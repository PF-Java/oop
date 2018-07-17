package ClassQuadraticEquation;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Chương trình giải phương trình bậc 2 dạng: ax2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b, c:");
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();
        QuadraticEquation qE = new QuadraticEquation(a, b, c);
        double delta = qE.getDiscriminant();
        if (delta < 0) {
            System.out.println("The equation has no root");
        } else if (delta == 0) {
            System.out.println("The equation has 1 root is: " + qE.getRoot1());
        } else {
            System.out.println("The equation has 2 root is: " + qE.getRoot1() + " and " + qE.getRoot2());
        }
    }
}
