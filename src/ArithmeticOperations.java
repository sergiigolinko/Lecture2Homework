import java.util.Scanner;

public class ArithmeticOperations {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Korin rivniannia x1");
        System.out.println(root1(1, 2, 3));
        System.out.println("Korin rivniannia x2");
        System.out.println(root2(1, 2, 3));
        System.out.println("Kurs dollara do hruvni");
        System.out.println(dollarCurrency(1000));
        System.out.println("Kurs euro do hruvni");
        System.out.println(euroCurrency(500));
        System.out.println("Kurs rublia do hruvni");
        System.out.println(rublCurrency(35));
        System.out.println("Perumetr priamokytnuka");
        System.out.println(rectanglePerimeter(2, 3));
        System.out.println("Ploscha priamokytnuka");
        System.out.println(rectangleSquare(2, 1));
        System.out.println("Perumetr kryga");
        System.out.println(circlePerimeter(3));
        System.out.println("Ploscha kryga");
        System.out.println(circleSquare(3));
        System.out.println("Ploscha culindra");
        System.out.println(cylinderSquare(2, 2));
        System.out.println("Obem culindra");
        System.out.println(cylinderVolume(1, 2));
        System.out.println("Ploscha shara");
        System.out.println(sphereSquare(2));
        System.out.println("Obem shara");
        System.out.println(sphereVolume(2));
        rootsVieta();

    }

    public static double root1(double a, double b, double c) {
        double d;
        d = b * b - 4 * a * c;
        return (-b + Math.sqrt(b)) / 2 * a;
    }

    public static double root2(double a, double b, double c) {
        double d;
        d = b * b - 4 * a * c;
        return (-b - Math.sqrt(b)) / 2 * a;
    }

    public static double dollarCurrency(double dol) {
        final double Currency = 24.9;
        return dol / Currency;
    }

    public static double euroCurrency(double eur) {
        final double Currency = 31.3;
        return eur / Currency;
    }

    public static double rublCurrency(double rub) {
        final double Currency = 0.5;
        return rub / Currency;
    }

    public static int rectanglePerimeter(int side1, int side2) {
        return 2 * (side1 + side2);

    }

    public static int rectangleSquare(int side1, int side2) {

        return side1 * side2;
    }

    public static double circlePerimeter(double radius) {
        final double Pi = 3.14;
        return 2 * Pi * radius;
    }

    public static double circleSquare(double radius) {
        final double Pi = 3.14;
        return Pi * radius * radius;
    }

    public static double cylinderSquare(double radius, double height) {
        final double Pi = 3.14;
        return 2 * Pi * radius * radius + 2 * Pi * radius * height;
    }

    public static double cylinderVolume(double radius, double height) {
        final double Pi = 3.14;
        return Pi * radius * radius * height;
    }

    public static double sphereSquare(double radius) {
        final double Pi = 3.14;
        return 4 * Pi * radius * radius;
    }

    public static double sphereVolume(double radius) {
        final double Pi = 3.14;
        return 4 * Pi * radius * radius * radius / 3;
    }

    private static void rootsVieta() {
        /*
        Рівняння x^2+b*x+c=0
        x1+x2=-b
        x1*x2=c
         */
        int b = SCANNER.nextInt();
        int c = SCANNER.nextInt();
        int x1 = 0;
        int x2 = 0;
        boolean ok = false;
        for (int i = -Math.abs(b); i <= Math.abs(b); i++) {
            x1 = i;
            x2 = (-b) - x1;
            if (x1 * x2 == c) {
                ok = true;
                break;
            }
        }
        if (!ok) {
            System.out.println("Rivniannia ne rozviazyetsia z dopomogou Vieta");
        } else {
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}
