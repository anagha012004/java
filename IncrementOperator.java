class IncreamenrOperator {
    public static void main(String args[]) {
        int x = 10;
        int y = x++;
        System.out.println("x=" + x + " ," + "y=" + y);
        y = ++x;
        System.out.println("x=" + x + " ," + "y=" + y);
        y = x--;
        System.out.println("x=" + x + " ," + "y=" + y);
        y = --x;
        System.out.println("x=" + x + " ," + "y=" + y);

    }
}