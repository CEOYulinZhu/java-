import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();  // 读取输入的长方体的长度
        double width = scanner.nextDouble();   // 读取输入的长方体的宽度
        double height = scanner.nextDouble();  // 读取输入的长方体的高度

        Cuboid cuboid = new Cuboid(length, width, height);  // 创建一个长方体对象
        Rectangle rectangle = new Rectangle(length, width); // 创建一个矩形对象

        System.out.println("这是体积计算：" + cuboid.getVolume()); // 输出长方体的体积
        System.out.println("这是底面积计算：" + rectangle.getArea()); // 输出长方体的底面积

        System.out.println("另一种实例化方式：");

        double area = length * width; // 计算长方体的底面积
        System.out.println("这是底面积计算：" + area);  // 输出长方体的底面积
        System.out.println("这是体积计算：" + cuboid.getVolume()); // 输出长方体的体积
    }
}

/**
 * 矩形类
 */
class Rectangle {
    private double length;  // 长方形的长度
    private double width;   // 长方形的宽度

    /**
     * 构造函数，初始化长方形的长度和宽度
     * @param length 长方形的长度
     * @param width 长方形的宽度
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * 获取长方形的长度
     * @return 长方形的长度
     */
    public double getLength() {
        return length;
    }

    /**
     * 获取长方形的宽度
     * @return 长方形的宽度
     */
    public double getWidth() {
        return width;
    }

    /**
     * 计算长方形的面积
     * @return 长方形的面积
     */
    public double getArea() {
        return length * width;
    }
}

/**
 * 长方体类，继承自矩形类
 */
class Cuboid extends Rectangle {
    private double height;  // 长方体的高度

    /**
     * 构造函数，初始化长方体的长度、宽度和高度
     * @param length 长方体的长度
     * @param width 长方体的宽度
     * @param height 长方体的高度
     */
    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    /**
     * 获取长方体的高度
     * @return 长方体的高度
     */
    public double getHeight() {
        return height;
    }

    /**
     * 计算长方体的体积
     * @return 长方体的体积
     */
    public double getVolume() {
        return super.getArea() * height;
    }

    /**
     * 计算长方体的表面积
     * @return 长方体的表面积
     */
    public double getArea() {
        return 2 * super.getArea() + 2 * getLengthWidthArea() + 2 * getHeightWidthArea();
    }

    /**
     * 计算长方体的长度和宽度的面积
     * @return 长方体的长度和宽度的面积
     */
    private double getLengthWidthArea() {
        return getLength() * getWidth();
    }

    /**
     * 计算长方体的高度和宽度的面积
     * @return 长方体的高度和宽度的面积
     */
    private double getHeightWidthArea() {
        return getHeight() * getWidth();
    }
}
