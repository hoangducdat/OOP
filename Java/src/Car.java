class Car extends Vehicle implements EngineFuel {
    int carTrunk;
    int numberOfSeats;
    @Override
    void startEngine() {
        System.out.println("khoi dong may");
    }
    @Override
    public void fuelLoading() {
        System.out.println("Dang nap nhien lieu....");
    }
    public int getCarTrunk() {
        return carTrunk;
    }
    public void setCarTrunk(int carTrunk) {
        this.carTrunk = carTrunk;
        System.out.println("so luong cop xe : " + carTrunk);
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        System.out.println("so cho ngoi cua xe la : " +numberOfSeats);
    }
}
