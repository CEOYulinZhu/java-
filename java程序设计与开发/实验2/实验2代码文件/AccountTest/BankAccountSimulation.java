import java.util.Scanner;


public class BankAccountSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("请输入存款余额，存款金额，第一次取款金额，第二次取款金额的数值：");
        double initialBalance = scanner.nextDouble();
        double depositAmount = scanner.nextDouble();
        double withdrawAmount1 = scanner.nextDouble();
        double withdrawAmount2 = scanner.nextDouble();

        // 创建一个账户对象
        Account account1 = new Account("123456789", "John Doe", "123 Main St", initialBalance, 100);

        // 输出初始存款余额
        System.out.printf("您的存款余额为%.1f元%n", account1.inquire());

        // 存款操作
        System.out.printf("存入%.1f元%n", depositAmount);
        account1.deposit(depositAmount);
        System.out.printf("您存款后的余额为%.1f元%n", account1.inquire());

        // 第一次取款操作
        System.out.printf("%n您要取出的金额为%.1f元%n", withdrawAmount1);
        account1.withdraw(withdrawAmount1);

        // 第二次取款操作
        System.out.printf("%n您要取出的金额为%.1f元%n", withdrawAmount2);
        account1.withdraw(withdrawAmount2);

        // 查询余额
        System.out.printf("%n您现在的存款余额为%.1f元%n", account1.inquire());
    }
}


class Account {
    private String account;  // 账号
    private String name;     // 储户姓名
    private String address;  // 地址
    private double balance;  // 存款余额
    private double minBalance;  // 最小余额

    // 构造方法，用于初始化账户信息
    public Account(String account, String name, String address, double balance, double minBalance) {
        this.account = account;
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    // 存款
    public void deposit(double amount) {
        this.balance += amount;
    }

    // 取款
    public void withdraw(double amount) {
        if (this.balance - amount < this.minBalance) {
            System.out.printf("操作失败！至少保留余额为%.1f元%n", this.minBalance);
        } else {
            this.balance -= amount;
            System.out.printf("操作成功！您的存款余额为%.1f元%n", this.balance);
        }
    }

    // 查询余额
    public double inquire() {
        return this.balance;
    }
}

