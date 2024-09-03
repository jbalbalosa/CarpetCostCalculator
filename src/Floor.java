package PACKAGE_NAME;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double height) {
        if (width < 0 ){width = 0;}
        if (height < 0 ){height = 0;}

        this.width = width;
        this.length = height;
    }

    public double getArea(){
        return this.width * this.length;
    }
}
