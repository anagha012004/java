public class Var {

    int x; // instance variable
    static String b = "Anagha Badhe";// static variable

    public Var() {
        this.x = 5;// initiaze=ation of intsance variable
    }

    public static void main(String args[]) {
        int a = 4;// local variable
        Var obj = new Var();
        System.out.println(a + " Local Variable");
        System.out.println(obj.b + " Static Variable");
        System.out.println(obj.x + " instance Variable");
    }
}