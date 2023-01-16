class Car {
    private int fuel;
    private int distance;

    public Car() {
        this.fuel = 35;
        this.distance = 0;
    }

    public void fill() {
        if (Math.random() < 0.1) {
            throw new Explosion("BOOM! :D");
        }
        int addedFuel = (int)(Math.random() * 20 + 15);
        fuel += addedFuel;
        System.err.println("Added " + addedFuel + " liters. Current fuel: " + fuel + " liters.");
    }

    public void drive100km() throws NotEnoughGas {
        if (fuel < 10) {
            throw new NotEnoughGas("Only " + fuel + " liters. Must fill the tank");
        }
        fuel -= 10;
        distance += 100;
        System.err.println(distance + "km driven, " + fuel + " liters left");
    }
}