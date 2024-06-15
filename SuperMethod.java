class Person {
    void message() {
        System.out.println("this is person class");
    }
}

class Student extends Person {
    void message() {
        System.out.println("this is student class");
    }

    void display() {
        message();
        super.message();
    }
}

class SuperMethod {
    public static void main(String args[]) {
        Student st = new Student();
        st.display();
    }
}
