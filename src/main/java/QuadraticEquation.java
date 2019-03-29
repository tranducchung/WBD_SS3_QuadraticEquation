import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("QuadraticEquation : ax2 + bx + c = 0 and a # 0");
        System.out.print("Enter a ");
        a = scanner.nextDouble();
        System.out.print("Enter b ");
        b = scanner.nextDouble();
        System.out.print("Enter c ");
        c = scanner.nextDouble();
        Account quadratic = new Account(a, b, c);
        double detal = quadratic.getDiscriminant();
        if (detal == 0) {
            System.out.println("QuadraticEquation " + quadratic.getA() + "x2 + " + quadratic.getB() + "x +" + quadratic.getC() + "= 0");
            System.out.println("Have r1 = r2 = " + quadratic.getRoot1());
        }
        if (detal > 0) {
            System.out.println("QuadraticEquation " + quadratic.getA() + "x2 + " + quadratic.getB() + "x +" + quadratic.getC() + "= 0");
            System.out.println("Have r1 = " + quadratic.getRoot1());
            System.out.println("Have r2 = " + quadratic.getRoot2());
        }
        if (detal < 0) {
            System.out.println("QuadraticEquation " + quadratic.getA() + "x2 + " + quadratic.getB() + "x +" + quadratic.getC() + "= 0");
            System.out.println("“The equation has no roots”");
        }

    }
}
