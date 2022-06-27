package Tutorium4;

public class DynamicDispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        A[] array = {a, b, c, d};

        for(A element : array) {
            System.out.println(("x(): "));
            element.x();
            System.out.println(("\ny(): "));
            element.y();
            System.out.println(("\nz(): "));
            element.z();
            System.out.println("------------------");
        }


    }
}


class A {
    public void x() {
        System.out.println("A x()");
        z();
    }

    public void y() {
        System.out.println("A y()");
        this.z();
    }

    public void z() {
        System.out.println("A z()");
    }
}

class B extends A {
    public void y() {
        System.out.println("B y()");
        x();
    }

    public void z() {
        System.out.println("B z()");
    }
}

class C extends B {
    public void x() {
        System.out.println("C x()");
        z();
    }
}

class D extends A {
    public void x() {
        System.out.println("D x()");
        super.x();
    }

    public void z(){
        System.out.println("D z()");
    }
}