class Person {
    Person() {
        System.out.println("this is parent class");
    }
}

class Student extends Person {
    Student() {
        super();
        System.out.println("this is student class");
    }
}

class SuperConstructor {
    public static void main(String args) {
        Student st = new Student();
    }
}