package Blatt1;
import java.lang.Math;

public class edge extends manager {
    point p1,p2;
    int id;

    edge(point a, point b, int id) {
        this.p1 = a;
        this.p2 = b;
        this.id = id;
    }

    float length() {
        return (float)this.p1.distanceTo(p2);

    }

    point edgeVector() {
        return p1.substract(p2);
    }

    public void print() {
        System.out.println("Edge at " + this + " Length: " + length() + " Points: ");
        p1.print();
        p2.print();
        System.out.println("---");

    }

}
