package Blatt1;

import java.text.DecimalFormat;

public class point {

    float x,y,z;

    point(float px, float py, float pz) {
        this.x = px;
        this.y = py;
        this.z = pz;
    }

    void translate(float tx, float ty, float tz) {
        this.x += tx;
        this.y += ty;
        this.z += tz;
    }

    point neg() { //Returns point with inversed signs
        return new point(-this.x, -this.y, -this.z);
    }

    point add(point p2) {
        return new point(this.x + p2.x, this.y + p2.y, this.z + p2.z);
    }

    point substract(point p2) {
        return add(p2.neg());
    }

    double vectorLength() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    double distanceTo(point p2) {
        return substract(p2).vectorLength();
    }

    public void print() {
        java.text.DecimalFormat df = new DecimalFormat("##.##");
        System.out.print("Point: ");
        System.out.print(this);
        System.out.print(" Coordinates [xyz]: " + df.format(this.x) + " " + df.format(this.y) + " " + df.format(this.y));
        System.out.println();

    }







}
