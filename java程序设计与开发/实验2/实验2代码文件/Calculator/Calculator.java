import java.util.Scanner;

public class Calculator {
    private int num1;  // ��һ��������
    private int num2;  // �ڶ���������

    // ��ȡ��һ���������ķ���
    public int getNum1() {
        return num1;
    }

    // ���õ�һ���������ķ���
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    // ��ȡ�ڶ����������ķ���
    public int getNum2() {
        return num2;
    }

    // ���õڶ����������ķ���
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // ִ�мӷ�����
    public int add() {
        return num1 + num2;
    }

    // ִ�м�������
    public int subtract() {
        return num1 - num2;
    }

    // ִ�г˷�����
    public int multiply() {
        return num1 * num2;
    }

    // ִ�г�������
    public double divide() {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("��������Ϊ�㡣");
            return Double.NaN;  // ����NaN��ʾ����Ϊ��
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        // ��ȡ�û�����ĵ�һ��������
        int num1 = scanner.nextInt();
        calculator.setNum1(num1);

        // ��ȡ�û�����ĵڶ���������
        int num2 = scanner.nextInt();
        calculator.setNum2(num2);

        // ִ�мӷ����㲢��ʾ���
        System.out.println("num1+num2=" + calculator.add());

        // ִ�м������㲢��ʾ���
        System.out.println("num1-num2=" + calculator.subtract());

        // ִ�г˷����㲢��ʾ���
        System.out.println("num1*num2=" + calculator.multiply());

        // ִ�г������㲢��ʾ���
        int result = (int)calculator.divide();
        if (!Double.isNaN(result)) {
            System.out.println("num1/num2=" + result);
        }

        scanner.close();
    }
}
