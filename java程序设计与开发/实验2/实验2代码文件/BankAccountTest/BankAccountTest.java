import java.util.Scanner;

class SavingAccount {
    private double balance; // ����
    private double interest=0.015; // ������ Ĭ����0.015

    // ���췽�������ڳ�ʼ���˻���Ϣ
    public SavingAccount(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    // ��������Ϣ
    public double calculateAnnualInterest() {
        return balance * interest;
    }

    // ��������Ϣ
    public double calculateMonthlyInterest() {
        return calculateAnnualInterest() / 12;
    }

    // ��ȡ����
    public double getBalance() {
        return balance;
    }

    // ����������
    public void setInterest(double newInterest) {
        this.interest = newInterest;
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ��ʾ�û��������������� ������Ŀֱ�����룬���Բ���Ҫ��ʾ
        //System.out.print("���������������ʣ���С����ʾ����");
        double initialBalance = scanner.nextDouble();
        double annualInterestRate = scanner.nextDouble();

        // ���� SavingAccount ����
        SavingAccount saver = new SavingAccount(initialBalance, annualInterestRate);

        // ��������Ϣ������Ϣ
        double annualInterest = saver.calculateAnnualInterest();
        double monthlyInterest = saver.calculateMonthlyInterest();

        // ������
        System.out.printf("���Ĵ��Ϊ%.1fԪ%n", saver.getBalance());
        System.out.printf("����ϢΪ%.1fԪ%n", annualInterest);
        System.out.printf("����ϢΪ%.1fԪ%n", monthlyInterest);
    }
}
