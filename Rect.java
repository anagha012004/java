public class Rect {
    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle();
        rectangle.show(5, 6);
        int area = rectangle.calculate();
        System.out.println("Area of Rectangle=" + area);
    }
}

class Rectangle {
    int length;
    int breadth;

    void show(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int calculate() {
        return (length * breadth);
    }
}
