public class Rational{
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public Rational addRationals(Rational NumeOrDeno) {
        return new Rational(this.numerator * NumeOrDeno.denominator + NumeOrDeno.numerator * this.denominator,
                            this.denominator * NumeOrDeno.denominator);
    }

    public Rational subtractRetionals(Rational NumeOrDeno) {
        return new Rational(this.numerator * NumeOrDeno.denominator - NumeOrDeno.numerator * this.denominator,
                            this.denominator * NumeOrDeno.denominator);
    }

    public Rational multiplyRationals(Rational NumeOrDeno) {
        return new Rational(this.numerator * NumeOrDeno.numerator, this.denominator * NumeOrDeno.denominator);
    }

    public Rational divideRationals(Rational NumeOrDeno) {
        return new Rational(this.numerator * NumeOrDeno.denominator, this.denominator * NumeOrDeno.numerator);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(3, 4);

        System.out.println("R1 FRACTION: " + r1.toString());
        System.out.println("R2 FRECTION: " + r2.toString());
        
        System.out.println("Addition: " + r1.addRationals(r2));
        System.out.println("Subtraction: " + r1.subtractRetionals(r2));
        System.out.println("Multiplication: " + r1.multiplyRationals(r2));
        System.out.println("Division: " + r1.divideRationals(r2));
    }
}
