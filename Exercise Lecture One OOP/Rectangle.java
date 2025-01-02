public class Rectangle{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getPerimeter(){
        return 2 * (length + width);
    }

    public double getArea(){
        return length * width;
    }

    public static void main(String[] args){
        Rectangle rect = new Rectangle(5.0, 3.0);
        System.out.println("Perimeter: " + rect.getPerimeter());
        System.out.println("Area: " + rect.getArea());
    }
}
