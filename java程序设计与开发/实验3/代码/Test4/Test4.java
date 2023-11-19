import java.util.Scanner;

// ����Ա����
class Employee {
    private String name;
    private String id;
    private double salary;

    // ���캯�����ڳ�ʼ��Ա������
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // ��ȡԱ������
    public String getName() {
        return name;
    }

    // ��ȡԱ������
    public String getId() {
        return id;
    }

    // ��ȡԱ����������
    public double getSalary() {
        return salary;
    }

    // ���Ա���Ļ�����Ϣ
    public void printInfo() {
        System.out.println("����: " + name + ", ����: " + id + ", ��������: " + salary);
    }
}

// ���������࣬�̳���Ա����
class Manager extends Employee {
    private double bonus;

    // ���캯�����ڳ�ʼ���������
    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary); // ���ø���Ĺ��캯��
        this.bonus = bonus;
    }

    // ��ȡ����Ľ���
    public double getBonus() {
        return bonus;
    }

    // ��д����ķ������������Ļ�����Ϣ
    @Override
    public void printInfo() {
        System.out.println("����: " + getName() + ", ����: " + getId() + ", ��������: " + getSalary() + ", ����: " + bonus);
    }
}

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ����Ա������  System.out.println("������Ա������ (���� ���� ��������):");
      
        String[] employeeData = scanner.nextLine().split(" ");
        String employeeName = employeeData[0];
        String employeeId = employeeData[1];
        double employeeSalary = Double.parseDouble(employeeData[2]);
        Employee employee = new Employee(employeeName, employeeId, employeeSalary);

        // ���뾭������  System.out.println("�����뾭������ (���� ���� �������� ����):");
      
        String[] managerData = scanner.nextLine().split(" ");
        String managerName = managerData[0];
        String managerId = managerData[1];
        double managerSalary = Double.parseDouble(managerData[2]);
        double managerBonus = Double.parseDouble(managerData[3]);
        Manager manager = new Manager(managerName, managerId, managerSalary, managerBonus);

        // ���Ա���;���Ļ�����Ϣ
        //System.out.println("Ա����Ϣ:");
        employee.printInfo();

       // System.out.println("������Ϣ:");
        manager.printInfo();
    }
}
