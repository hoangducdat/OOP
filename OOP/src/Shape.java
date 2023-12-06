public abstract class Shape {
    abstract double area();

    public static class Rectangle extends Shape {
        public double length;
        public double width;
        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        @Override
        double area() {
            return length * width;
        }
    }

    public static class Circle extends Shape{
        public double radius;
        Circle(double radius) {
            this.radius = radius;
        }
        @Override
        double area() {
            return Math.PI * Math.pow(radius , 2);
        }
    }
}
