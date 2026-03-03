/**
 * Circle defined by a center Point and radius.
 * Calculates area (pi*r^2) and perimeter (2*pi*r).
 */
public class Circle {
    private Point center;
    private double radius;

    public Circle() {
        this(new Point(), 0);
    }

    public Circle(double x, double y, double radius) {
        this(new Point((int) x, (int) y), radius);
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle [Center: " + center + ", Radius: " + radius +
               ", Area: " + area() + ", Perimeter: " + perimeter() + "]";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && circle.center.equals(center);
    }
}
