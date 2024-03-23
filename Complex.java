public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex sum(Complex other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new Complex(sumReal, sumImaginary);
    }

    public void display() {
        System.out.println("Complex number: " + this.real + " + " + this.imaginary + "i");
    }

    public static void main(String[] args) {

        Complex complex1 = new Complex(2.5, 3.7);
        Complex complex2 = new Complex(1.8, 4.2);
        Complex complex3;

        complex3 = complex1.sum(complex2);

        System.out.println("First complex number:");
        complex1.display();
        System.out.println("Second complex number:");
        complex2.display();
        System.out.println("Sum of the first and second complex numbers:");
        complex3.display();
    }
}
