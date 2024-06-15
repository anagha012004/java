class Demo {
    void test() {
        System.out.println("no parameter");
    }

    void test(int a) {
        System.out.println("parameter a:" + a);
    }

    void test(int a, int b) {
        System.out.println("parameter a and b:" + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a=" + a);
        return a * a;
    }
}

class Overload {
    public static void main(String args[]) {
        Demo overdemo = new Demo();
        overdemo.test();
        overdemo.test(10);
        overdemo.test(5, 9);
        double result = overdemo.test(188.9);
        System.out.println("result of overdemo.test(188.9):" + result);
    }
}