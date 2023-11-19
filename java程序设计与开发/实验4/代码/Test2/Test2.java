import java.util.Scanner;

// Shape��
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

// Circle��
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

// Triangle��
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

        // ����Բ�ε���Ϣ
        //System.out.println("������Բ�ε���ɫ�Ͱ뾶���ÿո�ָ�����");
        String circleColor = input.next();
        double radius = input.nextDouble();

        // ���������ε���Ϣ
        //System.out.println("�����������ε���ɫ�����߳��ȣ��ÿո�ָ�����");
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

        System.out.println("Circle����ɫΪ: " + circle.getColor());
        System.out.println("Circle�İ뾶Ϊ: " + circle.getRadius());
        System.out.println("Circle�����Ϊ: " + circle.area());
        System.out.println("Circle���ܳ�Ϊ: " + circle.perimeter());
        System.out.println();
        System.out.println("Triangle����ɫΪ: " + triangle.getColor());
        System.out.println("Triangle�ı߳��ֱ�Ϊ: " + side1 + ", " + side2 + ", " + side3);
        System.out.println("Triangle�����Ϊ: " + triangle.area());
        System.out.println("Triangle���ܳ�Ϊ: " + triangle.perimeter());

        input.close(); // �ر�������
    }
}
