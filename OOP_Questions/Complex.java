public class Complex{
    private double realPart;
    private double imaginaryPart;

    public Complex(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public Complex(){
        this.realPart = 1.0;
        this.imaginaryPart = 1.0;
    }

    public Complex addComplex(Complex numbers){
        return new Complex(this.realPart + numbers.realPart, this.imaginaryPart + numbers.imaginaryPart);
    }

    public Complex subtractComplex(Complex numbers){
        return new Complex(this.realPart - numbers.realPart, this.imaginaryPart - numbers.imaginaryPart);
    }

    public String toString(){
        return "(" + realPart + ", " + imaginaryPart + ")";
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3.0, 4.0);
        Complex c2 = new Complex(1.0, 2.0);


        System.out.println("\nbefore:");
        System.out.println("Object c1: " + c1.toString());
        System.out.println("Object c2: " + c2.toString());

        System.out.println("\nADDITION:  " + c1.addComplex(c2));
        System.out.println("SUBSTRUCTION: " + c1.subtractComplex(c2) + "\n");
    }
}
