import java.util.Scanner;

public class CircleWithException {
    double radius;
    double area;
    public static final double PI = Math.PI;

    public void setRadius(double radius) {
        if (radius < 0){
            throw new IllegalArgumentException("Radius has to be a positive number");
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() throws Exception {
        area = PI*radius*radius;
        if (area > 1000){
            throw new Exception("Area is bigger than 1000");
        } else {
            return area;
        }
    }

    public double getDiameter() {
        return 2*radius;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        CircleWithException c = new CircleWithException();
        System.out.print("Radius of circle:  ");

        try {
            double radius = scanner.nextDouble();
            c.setRadius(radius);
            System.out.println("Radius: " + c.getRadius() );
            System.out.println("Area: " + c.getArea());
            System.out.println("Diameter: " + c.getDiameter() );
        } catch(IllegalArgumentException e) {
            System.out.println("Illegal Argument: " + e.getMessage());
        } catch(Exception e) {
            System.out.println("Exception: "+ e.getMessage());
        }
    }
}