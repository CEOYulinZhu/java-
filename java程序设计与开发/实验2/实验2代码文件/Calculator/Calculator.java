import java.util.Scanner;

public class Calculator {
    private int num1;  // 第一个操作数
    private int num2;  // 第二个操作数

    // 获取第一个操作数的方法
    public int getNum1() {
        return num1;
    }

    // 设置第一个操作数的方法
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    // 获取第二个操作数的方法
    public int getNum2() {
        return num2;
    }

    // 设置第二个操作数的方法
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // 执行加法运算
    public int add() {
        return num1 + num2;
    }

    // 执行减法运算
    public int subtract() {
        return num1 - num2;
    }

    // 执行乘法运算
    public int multiply() {
        return num1 * num2;
    }

    // 执行除法运算
    public double divide() {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("除数不能为零。");
            return Double.NaN;  // 返回NaN表示除数为零
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        // 获取用户输入的第一个操作数
        int num1 = scanner.nextInt();
        calculator.setNum1(num1);

        // 获取用户输入的第二个操作数
        int num2 = scanner.nextInt();
        calculator.setNum2(num2);

        // 执行加法运算并显示结果
        System.out.println("num1+num2=" + calculator.add());

        // 执行减法运算并显示结果
        System.out.println("num1-num2=" + calculator.subtract());

        // 执行乘法运算并显示结果
        System.out.println("num1*num2=" + calculator.multiply());

        // 执行除法运算并显示结果
        int result = (int)calculator.divide();
        if (!Double.isNaN(result)) {
            System.out.println("num1/num2=" + result);
        }

        scanner.close();
    }
}
