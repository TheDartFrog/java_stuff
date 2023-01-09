public class Square {

    private int sideLength;
    private int area;

    private int perimeter;

    public Square(int sideLength) {

        this.sideLength = sideLength;

    }

    public String toString() {

        return(this.sideLength+"");

    }


 int getArea() {
    this.area = this.sideLength*this.sideLength;

    return this.area;
 }

    int getPerimeter() {

        this.perimeter=this.sideLength*4;

    return this.perimeter;

    }

}
