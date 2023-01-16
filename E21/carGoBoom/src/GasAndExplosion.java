class NotEnoughGas extends Exception {
    public NotEnoughGas(String exceptionMessage) {
        super(exceptionMessage);
    }
}

class Explosion extends RuntimeException {
    public Explosion(String exceptionMessage) {
        super(exceptionMessage);
    }
}