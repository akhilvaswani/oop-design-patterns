/**
 * Represents a 2D point with x and y coordinates.
 * Supports distance calculation between two points.
 */
public class Point {
    private int x, y;

    public Point(int newX, int newY) {
        x = newX;
        y = newY;
    }

    // default constructor at origin
    public Point() {
        this(0, 0);
    }

    public String toString() {
        return "x:" + x + ", y:" + y;
    }

    // euclidean distance to another point
    public double distance(Point other) {
        return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }
}
