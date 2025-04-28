package lang.object.test;

public class Rectangle {
    int width, height;

    // private int width;
    // private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{width=" +
                width +
                ", height=" +
                height +
                "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle other = (Rectangle) obj;
        return this.width == other.width && this.height == other.height;
    }

}
