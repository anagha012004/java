public class Dimension {
    private int feet;
    private int inches;

    public Dimension(int inches) {
        if (inches < 0) {
            this.feet = -1;
            this.inches = -1;
        } else {
            this.feet = inches / 12;
            this.inches = inches % 12;

            System.out.println("feets" + this.feet);
        }
    }

    public int getFeet() {

        System.out.println("feets" + this.feet);

        return feet;

    }

    public int getInches() {
        return inches;
    }

    public static void main(String[] args) {
        Dimension d = new Dimension(67);
        d.getFeet();
        d.getInches();
    }
}
