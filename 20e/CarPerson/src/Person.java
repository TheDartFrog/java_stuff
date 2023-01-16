class Person {
    private String name;
    private Car cars;

    public Person(String n) {
        name = n;
        cars = null;
    }
    public Person buys(String make, int price) {
        cars = new Car(make, price, cars);
        return this;
    }

    public String getName() {
        return name;
    }

    public void showCars() {
        if (cars != null) {
            cars.showCars();
        }
    }

    public void showCarsRev() {
        if (cars != null) {
            cars.showCarsRev();
        }
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        Car current = cars;
        while (current != null) {
            totalPrice += current.getPrice();
            current = current.getNext();
        }
        return totalPrice;
    }




    public boolean hasCar(String make) {
        make = make.toLowerCase();
        Car current = cars;

        while (current != null) {

            if (current.getMake().toLowerCase().equals(make)) {
                return true;
            }

            current = current.getNext();

        }

        return false;
    }


    public Car mostExpensive() {

        if (cars == null) {
            return null;
        }

        Car mostExpensive = cars;
        Car current = cars.getNext();

        while (current != null) {

            if (current.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = current;
            }

            current = current.getNext();

        }

        return mostExpensive;

    }



}
