package geometry;

public class Main {
        public static void main(String[] args) {
            Circle circle = new Circle(new Point(1.0, 1.0), 5.0);
    
            System.out.println("Centrum koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
            System.out.println("Promień koła: " + circle.getRadius());
            System.out.println("Obwód koła: " + circle.calculatePerimeter());
            System.out.println("Pole powierzchni koła: " + circle.getArea());
        }
    }