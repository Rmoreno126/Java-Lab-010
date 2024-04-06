public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void negate() {
        numerator = -numerator; // Reverse the sign of the numerator
    }

    public void invert() {
        int temp = numerator; // Temporary variable to hold the numerator
        numerator = denominator;
        denominator = temp;
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }

    public int gcd(int a, int b) {
        // Euclidean algorithm to find GCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public Rational reduce() {
        int gcdValue = gcd(numerator, denominator);
        return new Rational(numerator / gcdValue, denominator / gcdValue);
    }

    public Rational add(Rational other) {
        // Find the common denominator
        int lcd = this.denominator * other.denominator;

        // Add the numerators
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;

        // Create a new Rational object with the result
        return new Rational(newNumerator, lcd).reduce();
    }

    public void printRational() {
        System.out.println(numerator + "/" + denominator);
    }

    public String toString() {
        return numerator + "/" + denominator;    }


    public static void main(String[] args) {
        Rational demonstrate = new Rational();

        demonstrate.numerator = 20;
        demonstrate.denominator = 10;

        System.out.print("The rational number you chose is: ");
        demonstrate.printRational();
        System.out.println("Which just happens to be what I rate this code!");

        System.out.printf("%n--- Additional Methods! ---%n%n");

        System.out.print("Rational number using `toString`: " + demonstrate.toString());
        System.out.printf("%n%n");

        int a = 50;
        int b = 80;

        Rational demonstrateX2 = new Rational(a, b);

        System.out.print("The new rational number you chose is: ");
        demonstrateX2.printRational();

        demonstrateX2.negate();
        System.out.print("New negated rational number: ");
        demonstrateX2.printRational();

        demonstrateX2.invert();
        System.out.print("New inverted rational number: ");
        demonstrateX2.printRational();

        double result = demonstrateX2.toDouble();
        System.out.println("As a double: " + result);

        Rational reduced = demonstrateX2.reduce();
        System.out.print("Reduced rational number: ");
        reduced.printRational();

        Rational firstFraction = new Rational(3, 4);
        Rational secondFraction = new Rational(1, 2);

        // Add the fractions
        Rational results = firstFraction.add(secondFraction);

        System.out.print("First fraction: ");
        firstFraction.printRational();

        System.out.print("Second fraction: ");
        secondFraction.printRational();

        System.out.print("Sum of fractions: ");
        results.printRational();
    }
}
