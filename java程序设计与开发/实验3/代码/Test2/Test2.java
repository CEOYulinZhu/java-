import java.util.Scanner;

// ����Student��
class Student {
    // ����˽�����ԣ�ѧ�š�������Ӣ��ɼ�����ѧ�ɼ���������ɼ����ܳɼ�
    private int number;
    private String name;
    private double englishScore;
    private double mathScore;
    private double computerScore;
    private double totalScore;

    // ���췽������ʼ������ʱ����ѧ�š�������Ӣ��ɼ�����ѧ�ɼ���������ɼ��������
    public Student(int number, String name, double englishScore, double mathScore, double computerScore) {
        this.number = number; // ��ʼ��ѧ��
        this.name = name; // ��ʼ������
        this.englishScore = englishScore; // ��ʼ��Ӣ��ɼ�
        this.mathScore = mathScore; // ��ʼ����ѧ�ɼ�
        this.computerScore = computerScore; // ��ʼ��������ɼ�
        this.totalScore = sum(); // �����ܳɼ�
    }

    // ѧ�ŵ�setter��getter����
    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    // ������setter��getter����
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // Ӣ��ɼ���setter��getter������ͬʱ�����ܳɼ�
    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
        this.totalScore = sum();
    }
    public double getEnglishScore() {
        return englishScore;
    }

    // ��ѧ�ɼ���setter��getter������ͬʱ�����ܳɼ�
    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
        this.totalScore = sum();
    }
    public double getMathScore() {
        return mathScore;
    }

    // ������ɼ���setter��getter������ͬʱ�����ܳɼ�
    public void setComputerScore(double computerScore) {
        this.computerScore = computerScore;
        this.totalScore = sum();
    }
    public double getComputerScore() {
        return computerScore;
    }

    // �ܳɼ���getter����
    public double getTotalScore() {
        return totalScore;
    }

    // ����ȽϷ������Ƚ�����ѧ��������ܳɼ���С������1��ʾ��ǰ�����ܳɼ��ȴ���Ķ���󣬷���-1��ʾ��ǰ�����ܳɼ��ȴ���Ķ���С������0��ʾ���������ܳɼ����
    public int compare(Student other) {
        if (this.totalScore > other.totalScore) {
            return 1;
        } else if (this.totalScore < other.totalScore) {
            return -1;
        } else {
            return 0;
        }
    }

    // �����ܳɼ��ķ���
    public double sum() {
        return (englishScore + mathScore + computerScore) / 3.0;
    }

    // ��������ɼ��ķ��������������д�÷���ʵ�ֲ�ͬ�����ⷽʽ
    public double testScore() {
        return sum();
    }
}

// ����StudentXW�࣬�̳���Student��
class StudentXW extends Student {
    // �����µ����ԣ�ְ��
    private String responsibility;

    // ���๹�췽������ʼ������ʱ����ѧ�š�������Ӣ��ɼ�����ѧ�ɼ���������ɼ���ְ�����������������ø���Ĺ��췽��
    public StudentXW(int number, String name, double englishScore, double mathScore, double computerScore, String responsibility) {
        super(number, name, englishScore, mathScore, computerScore); // ���ø���Ĺ��췽��
        this.responsibility = responsibility; // ��ʼ��ְ��
    }

    // ��д����ɼ��ķ����������ܳɼ���3
    @Override
    public double testScore() {
        return sum() + 3;
    }
}

// ����StudentBZ�࣬�̳���Student��
class StudentBZ extends Student {
    // �����µ����ԣ�ְ��
    private String responsibility;

    // ���๹�췽������ʼ������ʱ����ѧ�š�������Ӣ��ɼ�����ѧ�ɼ���������ɼ���ְ�����������������ø���Ĺ��췽��
    public StudentBZ(int number, String name, double englishScore, double mathScore, double computerScore, String responsibility) {
        super(number, name, englishScore, mathScore, computerScore); // ���ø���Ĺ��췽��
        this.responsibility = responsibility; // ��ʼ��ְ��
    }

    // ��д����ɼ��ķ����������ܳɼ���5
    @Override
    public double testScore() {
        return sum() + 5;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ����2��Student�����2������������Ϣ
        Student student1 = createStudent(scanner.nextLine().split(","));
        Student student2 = createStudent(scanner.nextLine().split(","));
        StudentXW studentXW = createStudentXW(scanner.nextLine().split(","));
        StudentBZ studentBZ = createStudentBZ(scanner.nextLine().split(","));

        // ��������ɼ������
        System.out.println(student1.getName() + "'s evaluation score is " + student1.testScore());
        System.out.println(student2.getName() + "'s evaluation score is " + student2.testScore());
        System.out.println(studentXW.getName() + "'s evaluation score is " + studentXW.testScore());
        System.out.println(studentBZ.getName() + "'s evaluation score is " + studentBZ.testScore());
        System.out.println();

        // �����ܳɼ��ĶԱȲ�������
        compareAndPrint(student1, student2);
        compareAndPrint(student2, studentXW);
        compareAndPrint(studentXW, studentBZ);
        compareAndPrint(student1, studentBZ);
    }

    // ����һ����ͨѧ������ľ�̬�������������ѧ����Ϣ���ַ������飬����һ���µ�Student����
    public static Student createStudent(String[] data) {
        int number = Integer.parseInt(data[0]);
        String name = data[1];
        double englishScore = Double.parseDouble(data[2]);
        double mathScore = Double.parseDouble(data[3]);
        double computerScore = Double.parseDouble(data[4]);
        return new Student(number, name, englishScore, mathScore, computerScore);
    }

    // ����һ��ѧ����Ա�ɲ�����ľ�̬�������������ѧ����Ϣ���ַ������飬����һ���µ�StudentXW����
    public static StudentXW createStudentXW(String[] data) {
        int number = Integer.parseInt(data[0]);
        String name = data[1];
        double englishScore = Double.parseDouble(data[2]);
        double mathScore = Double.parseDouble(data[3]);
        double computerScore = Double.parseDouble(data[4]);
        String responsibility = data[5];
        return new StudentXW(number, name, englishScore, mathScore, computerScore, responsibility);
    }

    // ����һ��ѧ���೤����ľ�̬�������������ѧ����Ϣ���ַ������飬����һ���µ�StudentBZ����
    public static StudentBZ createStudentBZ(String[] data) {
        int number = Integer.parseInt(data[0]);
        String name = data[1];
        double englishScore = Double.parseDouble(data[2]);
        double mathScore = Double.parseDouble(data[3]);
        double computerScore = Double.parseDouble(data[4]);
        String responsibility = data[5];
        return new StudentBZ(number, name, englishScore, mathScore, computerScore, responsibility);
    }

    // �Ƚ�����ѧ��������ܳɼ���С����������
    public static void compareAndPrint(Student student1, Student student2) {
        int result = student1.compare(student2); // ����Student���compare�����Ƚ�����ѧ��������ܳɼ���С
        if (result > 0) { // �����ǰ�����ܳɼ��ȴ���Ķ���������ǰ�������ֺʹ�����������Լ�"total score is higher than"
            System.out.println(student1.getName() + "'s total score is higher than " + student2.getName());
        } else if (result < 0) { // �����ǰ�����ܳɼ��ȴ���Ķ���С�������ǰ�������ֺʹ�����������Լ�"total score is lower than"
            System.out.println(student1.getName() + "'s total score is lower than " + student2.getName());
        } else { // ������������ܳɼ���ȣ������ǰ�������ֺʹ�����������Լ�"total score is equal to"
            System.out.println(student1.getName() + "'s total score is equal to " + student2.getName());
        }
    }
}
