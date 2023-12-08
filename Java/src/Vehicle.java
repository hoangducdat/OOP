public abstract class Vehicle  {
    double speed;
    double capacity;
    abstract void startEngine();
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
        System.out.println("toc do toi da la : " +speed + "km/h");
    }
    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;
        System.out.println("dung tich la : " + capacity + "cm^3");
    }
}

