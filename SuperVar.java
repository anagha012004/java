class Vehicle {
    int speed = 120;

}

class car extends Vehicle {
    int speed = 100;

    void display() {
        System.out.println("speed=" + super.speed);
    }
}

class SuperVar {
    public static void main(String args[]) {
        car maxspeed = new car();
        maxspeed.display();
    }
}