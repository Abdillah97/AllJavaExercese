public class Triangle{
    private int a, b, c;

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isTriangle(){
        if(a > 0 && b > 0 && c > 0){
            if((a + b > c) && (a + c > b) && (b + c > a)){
                return true;
            }
            return false;
        }
        return false;
    }

    public double getArea(){
        if(isTriangle()){
            return 0.5 * (a * b);
        }else{
            return 0.0;
        }
    }

    public static void main(String[] args) {
        Triangle tr1 = new Triangle(3, 4, 5);
        Triangle tr2 = new Triangle(3, 4, 1);

        System.out.println("tr1 Is Triangle: " + tr1.isTriangle());
        System.out.println("tr1 Area: " + tr1.getArea());
        System.out.println("tr2 Is Triangle: " + tr2.isTriangle());
        System.out.println("tr2 Area: " + tr2.getArea());
    }
}
