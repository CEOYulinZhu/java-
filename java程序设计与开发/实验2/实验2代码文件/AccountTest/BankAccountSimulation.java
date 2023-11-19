import java.util.Scanner;


public class BankAccountSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("����������������һ��ȡ����ڶ���ȡ�������ֵ��");
        double initialBalance = scanner.nextDouble();
        double depositAmount = scanner.nextDouble();
        double withdrawAmount1 = scanner.nextDouble();
        double withdrawAmount2 = scanner.nextDouble();

        // ����һ���˻�����
        Account account1 = new Account("123456789", "John Doe", "123 Main St", initialBalance, 100);

        // �����ʼ������
        System.out.printf("���Ĵ�����Ϊ%.1fԪ%n", account1.inquire());

        // ������
        System.out.printf("����%.1fԪ%n", depositAmount);
        account1.deposit(depositAmount);
        System.out.printf("����������Ϊ%.1fԪ%n", account1.inquire());

        // ��һ��ȡ�����
        System.out.printf("%n��Ҫȡ���Ľ��Ϊ%.1fԪ%n", withdrawAmount1);
        account1.withdraw(withdrawAmount1);

        // �ڶ���ȡ�����
        System.out.printf("%n��Ҫȡ���Ľ��Ϊ%.1fԪ%n", withdrawAmount2);
        account1.withdraw(withdrawAmount2);

        // ��ѯ���
        System.out.printf("%n�����ڵĴ�����Ϊ%.1fԪ%n", account1.inquire());
    }
}


class Account {
    private String account;  // �˺�
    private String name;     // ��������
    private String address;  // ��ַ
    private double balance;  // ������
    private double minBalance;  // ��С���

    // ���췽�������ڳ�ʼ���˻���Ϣ
    public Account(String account, String name, String address, double balance, double minBalance) {
        this.account = account;
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    // ���
    public void deposit(double amount) {
        this.balance += amount;
    }

    // ȡ��
    public void withdraw(double amount) {
        if (this.balance - amount < this.minBalance) {
            System.out.printf("����ʧ�ܣ����ٱ������Ϊ%.1fԪ%n", this.minBalance);
        } else {
            this.balance -= amount;
            System.out.printf("�����ɹ������Ĵ�����Ϊ%.1fԪ%n", this.balance);
        }
    }

    // ��ѯ���
    public double inquire() {
        return this.balance;
    }
}

