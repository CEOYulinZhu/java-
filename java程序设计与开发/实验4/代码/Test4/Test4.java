// Shape接口
interface Shape {
    double area(double param);
}

// Square类
class Square implements Shape {
    @Override
    public double area(double side) {
        return side * side;
    }
}

// Circle类
class Circle implements Shape {
    @Override
    public double area(double radius) {
        return Math.PI * radius * radius;
    }
}

// 测试类
public class Test4 {
    public static void main(String[] args) {
        Shape square = new Square();
        Shape circle = new Circle();

        double side = 2.0;
        double radius = 3.0;
        System.out.println("Circle's area is " + circle.area(radius));
        System.out.println("Square's area is " + square.area(side));
        
    }
}
