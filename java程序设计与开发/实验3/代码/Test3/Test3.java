import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();  // ��ȡ����ĳ�����ĳ���
        double width = scanner.nextDouble();   // ��ȡ����ĳ�����Ŀ��
        double height = scanner.nextDouble();  // ��ȡ����ĳ�����ĸ߶�

        Cuboid cuboid = new Cuboid(length, width, height);  // ����һ�����������
        Rectangle rectangle = new Rectangle(length, width); // ����һ�����ζ���

        System.out.println("����������㣺" + cuboid.getVolume()); // �������������
        System.out.println("���ǵ�������㣺" + rectangle.getArea()); // ���������ĵ����

        System.out.println("��һ��ʵ������ʽ��");

        double area = length * width; // ���㳤����ĵ����
        System.out.println("���ǵ�������㣺" + area);  // ���������ĵ����
        System.out.println("����������㣺" + cuboid.getVolume()); // �������������
    }
}

/**
 * ������
 */
class Rectangle {
    private double length;  // �����εĳ���
    private double width;   // �����εĿ��

    /**
     * ���캯������ʼ�������εĳ��ȺͿ��
     * @param length �����εĳ���
     * @param width �����εĿ��
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * ��ȡ�����εĳ���
     * @return �����εĳ���
     */
    public double getLength() {
        return length;
    }

    /**
     * ��ȡ�����εĿ��
     * @return �����εĿ��
     */
    public double getWidth() {
        return width;
    }

    /**
     * ���㳤���ε����
     * @return �����ε����
     */
    public double getArea() {
        return length * width;
    }
}

/**
 * �������࣬�̳��Ծ�����
 */
class Cuboid extends Rectangle {
    private double height;  // ������ĸ߶�

    /**
     * ���캯������ʼ��������ĳ��ȡ���Ⱥ͸߶�
     * @param length ������ĳ���
     * @param width ������Ŀ��
     * @param height ������ĸ߶�
     */
    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    /**
     * ��ȡ������ĸ߶�
     * @return ������ĸ߶�
     */
    public double getHeight() {
        return height;
    }

    /**
     * ���㳤��������
     * @return ����������
     */
    public double getVolume() {
        return super.getArea() * height;
    }

    /**
     * ���㳤����ı����
     * @return ������ı����
     */
    public double getArea() {
        return 2 * super.getArea() + 2 * getLengthWidthArea() + 2 * getHeightWidthArea();
    }

    /**
     * ���㳤����ĳ��ȺͿ�ȵ����
     * @return ������ĳ��ȺͿ�ȵ����
     */
    private double getLengthWidthArea() {
        return getLength() * getWidth();
    }

    /**
     * ���㳤����ĸ߶ȺͿ�ȵ����
     * @return ������ĸ߶ȺͿ�ȵ����
     */
    private double getHeightWidthArea() {
        return getHeight() * getWidth();
    }
}
