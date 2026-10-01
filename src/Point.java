/**
 * The Point Class.
 */
public class Point {

    /** x and y coordinates. */
    public Double x, y;

    /**
     * Instantiates a new point.
     *
     * @param x the x
     * @param y the y
     */
    Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
    // fault: both this.x and this.y were being assigned to y
    // fix: this.x = x
}
