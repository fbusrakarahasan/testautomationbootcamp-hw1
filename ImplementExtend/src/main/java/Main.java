/*
    Enuygun Bootcamp HW-1
    Fatma Büşra KARAHASAN
*/

interface Implement {
    default public void out() {
        System.out.println("Implements once yurutulur.");
    }
}
class Extend {
    public void out() {
        System.out.println("Extend once yurutulur.");
    }
}

public class Main extends Extend implements Implement {
    public static void main(String[] args) {
        Main oncelik = new Main();
        oncelik.out();
    }
}


