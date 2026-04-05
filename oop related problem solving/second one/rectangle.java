public class rectangle {
    private int length, width;

    public void setValue(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return (2 * (length + width));
    }
}
