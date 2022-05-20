package Blatt1;

public class manager {
    public static void main(String[] args) {
        point[] p;
        p = new point[8];


        p[0] = new point(0,0,0);
        p[1] = new point(1,0,0);
        p[2] = new point(1,1,0);
        p[3] = new point(0,1,0);
        p[4] = new point(0,0,1);
        p[5] = new point(1,0,1);
        p[6] = new point(1,1,1);
        p[7] = new point(0,1,1);

        for(Blatt1.point point : p) {
            point.print();
        }

        p[0].toString();


        edge[] e;
        e = new edge[12];

        e[0] = new edge(p[0], p[1], 0);
        e[1] = new edge(p[1], p[2], 1);
        e[2] = new edge(p[2], p[3], 2);
        e[3] = new edge(p[3], p[0], 3);
        e[4] = new edge(p[1], p[5], 4);
        e[5] = new edge(p[2], p[6], 5);
        e[6] = new edge(p[3], p[7], 6);
        e[7] = new edge(p[0], p[4], 7);
        e[8] = new edge(p[4], p[5], 8);
        e[9] = new edge(p[5], p[6], 9);
        e[10] = new edge(p[6], p[7], 10);
        e[11] = new edge(p[7], p[4], 11);




        surface[] s;
        s = new surface[6];
        edge[] loop = { e[0], e[3], e[4], e[1] };

        s[0] = new surface(loop);

        s[0].print();







    }
}
