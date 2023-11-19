import java.util.Scanner;

// 创建员工类
class Employee {
    private String name;
    private String id;
    private double salary;

    // 构造函数用于初始化员工对象
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // 获取员工姓名
    public String getName() {
        return name;
    }

    // 获取员工工号
    public String getId() {
        return id;
    }

    // 获取员工基本工资
    public double getSalary() {
        return salary;
    }

    // 输出员工的基本信息
    public void printInfo() {
        System.out.println("姓名: " + name + ", 工号: " + id + ", 基本工资: " + salary);
    }
}

// 创建经理类，继承自员工类
class Manager extends Employee {
    private double bonus;

    // 构造函数用于初始化经理对象
    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary); // 调用父类的构造函数
        this.bonus = bonus;
    }

    // 获取经理的奖金
    public double getBonus() {
        return bonus;
    }

    // 重写父类的方法以输出经理的基本信息
    @Override
    public void printInfo() {
        System.out.println("姓名: " + getName() + ", 工号: " + getId() + ", 基本工资: " + getSalary() + ", 奖金: " + bonus);
    }
}

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入员工数据  System.out.println("请输入员工数据 (姓名 工号 基本工资):");
      
        String[] employeeData = scanner.nextLine().split(" ");
        String employeeName = employeeData[0];
        String employeeId = employeeData[1];
        double employeeSalary = Double.parseDouble(employeeData[2]);
        Employee employee = new Employee(employeeName, employeeId, employeeSalary);

        // 输入经理数据  System.out.println("请输入经理数据 (姓名 工号 基本工资 奖金):");
      
        String[] managerData = scanner.nextLine().split(" ");
        String managerName = managerData[0];
        String managerId = managerData[1];
        double managerSalary = Double.parseDouble(managerData[2]);
        double managerBonus = Double.parseDouble(managerData[3]);
        Manager manager = new Manager(managerName, managerId, managerSalary, managerBonus);

        // 输出员工和经理的基本信息
        //System.out.println("员工信息:");
        employee.printInfo();

       // System.out.println("经理信息:");
        manager.printInfo();
    }
}
