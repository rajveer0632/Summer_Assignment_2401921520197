
abstract class Compartment {
    // Abstract function notice
    public abstract String notice();
}


class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "This is the First Class Compartment!";
    }
}

class Ladies extends Compartment {
    @Override
    public String notice() {
        return "This is the Ladies Compartment!";
    }
}


class General extends Compartment {
    @Override
    public String notice() {
        return "This is the General Compartment!";
    }
}


class Luggage extends Compartment {
    @Override
    public String notice() {
        return "This is the Luggage Compartment!";
    }
}


public class TestCompartment {
    public static void main(String[] args) {
       
        Compartment[] c = new Compartment[10];
        
       
        for (int i = 0; i < 10; i++) {
            
            int j = (int) (Math.random() * 4) + 1;
            
            
            switch(j) {
                case 1:
                    c[i] = new FirstClass();
                    break;
                case 2:
                    c[i] = new Ladies();
                    break;
                case 3:
                    c[i] = new General();
                    break;
                case 4:
                    c[i] = new Luggage();
                    break;
            }
        }
        
        System.out.println("Polymorphic behavior of notice method:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Compartment " + (i + 1) + ": " + c[i].notice());
        }
    }
}