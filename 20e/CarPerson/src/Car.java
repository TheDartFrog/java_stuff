class Car {
    private String make;
    private int price;
    private Car next;

    public Car(String m, int p, Car n) {

        make = m;
        price = p;
        next = n;

    }

    public Car(String make, int price) {

        this(make, price, null);

    }

    public String getMake() {
        return make;
    }

    public int getPrice() {
        return price;
    }

    public Car getNext() {
        return next;
    }

    public void showCars() {

        System.out.print(this);

        Car current = next;

        while (current != null) {

            System.out.print(current);
            current = current.next;

        }
    }

    public void showCarsRev() {

        if (next != null) {
            next.showCarsRev();
        }

        System.out.print(this);
    }

    @Override
    public String toString() {

        return "(" + make + ", " + price + ") ";

    }
}