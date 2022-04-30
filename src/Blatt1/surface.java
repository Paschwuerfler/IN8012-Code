package Blatt1;

public class surface {

    edge[] e;

    surface(edge[] edges) {
        this.e = edges;


    }

    double area() {
        return -1;
    }

    double circumfrence() {
        double c = 0;
        for (Blatt1.edge edge : e) {
            c += edge.length();
        }

        return c;
    }

    public void print() {
        System.out.println("Surface at " + this + " circumference " + circumfrence()  + " Edges: " );
        for(Blatt1.edge edge : e) {
            System.out.print(edge.id + " ");
        }


    }


}