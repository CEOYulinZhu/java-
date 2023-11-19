import java.util.Scanner;

// Shape类
class Shape {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double area() {
        return 0.0;
    }

    public double perimeter() {
        return 0.0;
    }
}

// Circle类
class Circle extends Shape {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Triangle类
class Triangle extends Shape {
    private double sideA, sideB, sideC;

    public void setSides(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public double area() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 输入圆形的信息
        //System.out.println("请输入圆形的颜色和半径（用空格分隔）：");
        String circleColor = input.next();
        double radius = input.nextDouble();

        // 输入三角形的信息
        //System.out.println("请输入三角形的颜色和三边长度（用空格分隔）：");
        String triangleColor = input.next();
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        Circle circle = new Circle();
        circle.setColor(circleColor);
        circle.setRadius(radius);

        Triangle triangle = new Triangle();
        triangle.setColor(triangleColor);
        triangle.setSides(side1, side2, side3);

        System.out.println("Circle的颜色为: " + circle.getColor());
        System.out.println("Circle的半径为: " + circle.getRadius());
        System.out.println("Circle的面积为: " + circle.area());
        System.out.println("Circle的周长为: " + circle.perimeter());
        System.out.println();
        System.out.println("Triangle的颜色为: " + triangle.getColor());
        System.out.println("Triangle的边长分别为: " + side1 + ", " + side2 + ", " + side3);
        System.out.println("Triangle的面积为: " + triangle.area());
        System.out.println("Triangle的周长为: " + triangle.perimeter());

        input.close(); // 关闭输入流
    }
}
