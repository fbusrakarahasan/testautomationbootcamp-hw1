/*
    Enuygun Bootcamp HW-1
    Fatma Büşra KARAHASAN
*/

abstract class A {
    void callA() {
        System.out.println("Enuygun Test Otomasyon Bootcamp'ine");
    }
}
class B extends A {
    void callB() {
        System.out.println("hos geldiniz.");
    }
}

class SoyutlamaOrnek {
    public static void main(String[] args) {
        B b = new B();
        b.callA();
        b.callB();
    }
}