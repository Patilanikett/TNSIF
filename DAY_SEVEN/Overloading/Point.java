public class Point {
    private float x;
    private float y;

    public Point() {
        x = 0.0f;
        y = 0.0f;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = (float) x;
        this.y = (float) y;
    }

    public Point(double x, double y) {
        this.x = (float) x;
        this.y = (float) y;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}
