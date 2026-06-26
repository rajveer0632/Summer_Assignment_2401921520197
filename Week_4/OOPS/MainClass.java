class Outer {
    void display() {
        System.out.println("Display method of outer class");
    }

    class Inner {
        void display() {
            System.out.println("Display method of inner class");
        }
    }
}

public class MainClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();

        Outer.Inner i = o.new Inner();
        i.display();
    }
}