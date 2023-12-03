public abstract class Shape {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(12,4);
        System.out.println("dien tich hinh tron la : " + circle.calculateArea());
        System.out.println("dien tich hinh chu nhat la : " + rectangle.calculateArea());
    }
    public abstract double calculateArea();
}
class Circle extends Shape {
    public double radius;

    public  Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
class Rectangle extends Shape {
    public double chieuDai;
    public double chieuRong;
    public Rectangle(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    @Override
    public double calculateArea() {
        return chieuDai * chieuRong;
    }
}

