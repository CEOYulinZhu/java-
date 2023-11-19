import java.util.Scanner;
import java.lang.Math;

class Circle {
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    public double perimeter() {
        return 2 * Math.PI * r;
    }

    public double area() {
        return Math.PI * r * r;
    }
}

class Cylinder extends Circle {
    private double h;

    public Cylinder(double x, double y, double r, double h) {
        super(x, y, r);
        this.h = h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getH() {
        return h;
    }

    @Override
    public double area() {
        double sideArea = 2 * Math.PI * getR() * h;
        double bottomArea = 2 * super.area();
        return sideArea + bottomArea;
    }

    public double volume() {
        return super.area() * h;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double x = scanner.nextDouble();

        
        double y = scanner.nextDouble();

        
        double r = scanner.nextDouble();

        
        double h = scanner.nextDouble();

        // 创建Cylinder对象
        Cylinder cylinder = new Cylinder(x, y, r, h);

        // 输出属性
        System.out.printf("圆心坐标为(%.1f,%.1f),%n", cylinder.getX(), cylinder.getY());
        System.out.printf("圆半径为%.1f, 高度为%.1f,%n", cylinder.getR(), cylinder.getH());

        // 计算并输出表面积和体积
        System.out.printf("表面积为%.14f, 体积为%.14f%n", cylinder.area(), cylinder.volume());
    }
}
