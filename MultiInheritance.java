interface Walking {
    void walk();
}

interface Eating {
    void eat();
}

class MultiInheritance implements Walking, Eating {
    public void walk() {
        System.out.println("duck is walking");
    }

    public void eat() {
        System.out.println("duck is eating");
    }

    public static void main(String args[]) {
        MultiInheritance duck = new MultiInheritance();
        duck.walk();
        duck.eat();
    }
}
