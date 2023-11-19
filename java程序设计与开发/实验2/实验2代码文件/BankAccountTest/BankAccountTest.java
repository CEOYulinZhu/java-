import java.util.Scanner;

class SavingAccount {
    private double balance; // 存款额
    private double interest=0.015; // 年利率 默认是0.015

    // 构造方法，用于初始化账户信息
    public SavingAccount(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    // 计算年利息
    public double calculateAnnualInterest() {
        return balance * interest;
    }

    // 计算月利息
    public double calculateMonthlyInterest() {
        return calculateAnnualInterest() / 12;
    }

    // 获取存款额
    public double getBalance() {
        return balance;
    }

    // 设置年利率
    public void setInterest(double newInterest) {
        this.interest = newInterest;
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入存款额和年利率 但是题目直接输入，所以不需要提示
        //System.out.print("请输入存款额和年利率（以小数表示）：");
        double initialBalance = scanner.nextDouble();
        double annualInterestRate = scanner.nextDouble();

        // 创建 SavingAccount 对象
        SavingAccount saver = new SavingAccount(initialBalance, annualInterestRate);

        // 计算年利息和月利息
        double annualInterest = saver.calculateAnnualInterest();
        double monthlyInterest = saver.calculateMonthlyInterest();

        // 输出结果
        System.out.printf("您的存款为%.1f元%n", saver.getBalance());
        System.out.printf("年利息为%.1f元%n", annualInterest);
        System.out.printf("月利息为%.1f元%n", monthlyInterest);
    }
}
