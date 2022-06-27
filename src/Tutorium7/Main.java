package Tutorium7;

import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.max;

class Box {
    public Box(int id, int width, int height, int length) {
        this.id = id;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    protected int id;
    protected int width;
    protected int height;
    protected int length;

    //@Override
    public int compareTo(Box o) {
        if (o.length < length && o.height < height && o.width < width) {
            return -1;
        }
        return 1;

    }

}


public class Main {

    static int getMaxHeigth(Set<Box> remainingBoxes, Box lastBox) {
        if (remainingBoxes.isEmpty()) //wenn keine Boxen mehr da
            //Gebe die Höhe der letzten Box (falls vorhanden) zurück
            return lastBox != null ? lastBox.height : 0;

        HashSet<Box> copySet = new HashSet<>(remainingBoxes);


        int maxTower = 0;
        for (Box b : remainingBoxes) {
            if (lastBox == null || lastBox.compareTo(b) < 0) {
                copySet.remove(b);

                maxTower = max(getMaxHeigth(copySet, b), maxTower);


                copySet.add(b);
            }
        }

        return (lastBox != null ? lastBox.height : 0) + maxTower;

    }




    public static void main(String[] args) {
        Set<Box> boxes = new HashSet<>();
        boxes.add(new Box(1, 1, 2, 3));
        boxes.add(new Box(2, 4, 3, 3));
        boxes.add(new Box(3, 2, 2, 5));
        boxes.add(new Box(4, 1, 2, 1));
        boxes.add(new Box(5, 5, 5, 4));
        int maxHeigth = getMaxHeigth(boxes, null);
        System.out.println(maxHeigth);
    }
}