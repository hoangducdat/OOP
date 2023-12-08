class Boat extends Vehicle implements EngineFuel {
    int thrustTurbine;
    @Override
    void startEngine() {
        System.out.println("khoi dong may");
    }
    @Override
    public void fuelLoading() {
        System.out.println("Dang nap nhien lieu....");
    }
    public int getThrustTurbine() {
        return thrustTurbine;
    }
    public void setThrustTurbine(int thrustTurbine) {
        this.thrustTurbine = thrustTurbine;
        System.out.println("so tu bin day la : " + thrustTurbine);
    }
}
