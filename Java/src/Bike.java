class Bike extends Vehicle  {
    int carBasket;
    @Override
    void startEngine() {
        System.out.println("dap xe di nao");
    }
    public int getCarBasket() {
        return carBasket;
    }
    public void setCarBasket(int carBasket) {
        this.carBasket = carBasket;
        System.out.println("so gio xe la : " + carBasket);
    }
}
