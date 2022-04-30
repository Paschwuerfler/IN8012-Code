package Blatt1;

public class hull {
    surface[] s;
    hull(surface[] surfaces) {
        for(int i = 0; i < surfaces.length;  i ++) {
            s[i] = surfaces[i];
        }
    }
}
