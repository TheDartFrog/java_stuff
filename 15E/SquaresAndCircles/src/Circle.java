public class Circle {



    private int radiusLength;
    private double area;
    private double circum;

    public static Square[] pogs = {};

    public Circle(int radiusLength) {

        this.radiusLength = radiusLength;

    }

    double getArea() {
        this.area = Math.PI*this.radiusLength*this.radiusLength;

        return this.area;
    }

    double getCircumference() {

        this.circum = 2*Math.PI*this.radiusLength;

        return this.circum;

    }

    public String toString() {

        return(this.radiusLength+"");

    }
/*
    public static Square[] getSquares(Circle[] arr)
    {

    for(Circle s : arr){ new Square((int)s.circum*(int)1.13/4); }

    return pogs;
    }
*/
}
