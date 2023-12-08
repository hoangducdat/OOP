class Truck extends Vehicle implements EngineFuel {
    int numberOfWheels;
    String engineType;
    @Override
    void startEngine() {
        System.out.println("khoi dong may");
    }
    @Override
    public void fuelLoading() {
        System.out.println("Dang nap nhien lieu....");
    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        System.out.println("so banh xe la : " + numberOfWheels);
    }
    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
        System.out.println("dong co cua xe la : " + engineType);
    }
}

