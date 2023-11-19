import java.util.Scanner;

// 定义Student类
class Student {
    // 定义私有属性：学号、姓名、英语成绩、数学成绩、计算机成绩、总成绩
    private int number;
    private String name;
    private double englishScore;
    private double mathScore;
    private double computerScore;
    private double totalScore;

    // 构造方法，初始化对象时传入学号、姓名、英语成绩、数学成绩、计算机成绩五个参数
    public Student(int number, String name, double englishScore, double mathScore, double computerScore) {
        this.number = number; // 初始化学号
        this.name = name; // 初始化姓名
        this.englishScore = englishScore; // 初始化英语成绩
        this.mathScore = mathScore; // 初始化数学成绩
        this.computerScore = computerScore; // 初始化计算机成绩
        this.totalScore = sum(); // 计算总成绩
    }

    // 学号的setter和getter方法
    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    // 姓名的setter和getter方法
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // 英语成绩的setter和getter方法，同时更新总成绩
    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
        this.totalScore = sum();
    }
    public double getEnglishScore() {
        return englishScore;
    }

    // 数学成绩的setter和getter方法，同时更新总成绩
    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
        this.totalScore = sum();
    }
    public double getMathScore() {
        return mathScore;
    }

    // 计算机成绩的setter和getter方法，同时更新总成绩
    public void setComputerScore(double computerScore) {
        this.computerScore = computerScore;
        this.totalScore = sum();
    }
    public double getComputerScore() {
        return computerScore;
    }

    // 总成绩的getter方法
    public double getTotalScore() {
        return totalScore;
    }

    // 定义比较方法，比较两个学生对象的总成绩大小，返回1表示当前对象总成绩比传入的对象大，返回-1表示当前对象总成绩比传入的对象小，返回0表示两个对象总成绩相等
    public int compare(Student other) {
        if (this.totalScore > other.totalScore) {
            return 1;
        } else if (this.totalScore < other.totalScore) {
            return -1;
        } else {
            return 0;
        }
    }

    // 计算总成绩的方法
    public double sum() {
        return (englishScore + mathScore + computerScore) / 3.0;
    }

    // 计算评测成绩的方法，子类可以重写该方法实现不同的评测方式
    public double testScore() {
        return sum();
    }
}

// 定义StudentXW类，继承自Student类
class StudentXW extends Student {
    // 定义新的属性：职责
    private String responsibility;

    // 子类构造方法，初始化对象时传入学号、姓名、英语成绩、数学成绩、计算机成绩和职责六个参数，并调用父类的构造方法
    public StudentXW(int number, String name, double englishScore, double mathScore, double computerScore, String responsibility) {
        super(number, name, englishScore, mathScore, computerScore); // 调用父类的构造方法
        this.responsibility = responsibility; // 初始化职责
    }

    // 重写评测成绩的方法，返回总成绩加3
    @Override
    public double testScore() {
        return sum() + 3;
    }
}

// 定义StudentBZ类，继承自Student类
class StudentBZ extends Student {
    // 定义新的属性：职责
    private String responsibility;

    // 子类构造方法，初始化对象时传入学号、姓名、英语成绩、数学成绩、计算机成绩和职责六个参数，并调用父类的构造方法
    public StudentBZ(int number, String name, double englishScore, double mathScore, double computerScore, String responsibility) {
        super(number, name, englishScore, mathScore, computerScore); // 调用父类的构造方法
        this.responsibility = responsibility; // 初始化职责
    }

    // 重写评测成绩的方法，返回总成绩加5
    @Override
    public double testScore() {
        return sum() + 5;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入2个Student对象和2个子类对象的信息
        Student student1 = createStudent(scanner.nextLine().split(","));
        Student student2 = createStudent(scanner.nextLine().split(","));
        StudentXW studentXW = createStudentXW(scanner.nextLine().split(","));
        StudentBZ studentBZ = createStudentBZ(scanner.nextLine().split(","));

        // 计算评测成绩并输出
        System.out.println(student1.getName() + "'s evaluation score is " + student1.testScore());
        System.out.println(student2.getName() + "'s evaluation score is " + student2.testScore());
        System.out.println(studentXW.getName() + "'s evaluation score is " + studentXW.testScore());
        System.out.println(studentBZ.getName() + "'s evaluation score is " + studentBZ.testScore());
        System.out.println();

        // 进行总成绩的对比并输出结果
        compareAndPrint(student1, student2);
        compareAndPrint(student2, studentXW);
        compareAndPrint(studentXW, studentBZ);
        compareAndPrint(student1, studentBZ);
    }

    // 创建一个普通学生对象的静态方法，传入包含学生信息的字符串数组，返回一个新的Student对象
    public static Student createStudent(String[] data) {
        int number = Integer.parseInt(data[0]);
        String name = data[1];
        double englishScore = Double.parseDouble(data[2]);
        double mathScore = Double.parseDouble(data[3]);
        double computerScore = Double.parseDouble(data[4]);
        return new Student(number, name, englishScore, mathScore, computerScore);
    }

    // 创建一个学生党员干部对象的静态方法，传入包含学生信息的字符串数组，返回一个新的StudentXW对象
    public static StudentXW createStudentXW(String[] data) {
        int number = Integer.parseInt(data[0]);
        String name = data[1];
        double englishScore = Double.parseDouble(data[2]);
        double mathScore = Double.parseDouble(data[3]);
        double computerScore = Double.parseDouble(data[4]);
        String responsibility = data[5];
        return new StudentXW(number, name, englishScore, mathScore, computerScore, responsibility);
    }

    // 创建一个学生班长对象的静态方法，传入包含学生信息的字符串数组，返回一个新的StudentBZ对象
    public static StudentBZ createStudentBZ(String[] data) {
        int number = Integer.parseInt(data[0]);
        String name = data[1];
        double englishScore = Double.parseDouble(data[2]);
        double mathScore = Double.parseDouble(data[3]);
        double computerScore = Double.parseDouble(data[4]);
        String responsibility = data[5];
        return new StudentBZ(number, name, englishScore, mathScore, computerScore, responsibility);
    }

    // 比较两个学生对象的总成绩大小，并输出结果
    public static void compareAndPrint(Student student1, Student student2) {
        int result = student1.compare(student2); // 调用Student类的compare方法比较两个学生对象的总成绩大小
        if (result > 0) { // 如果当前对象总成绩比传入的对象大，输出当前对象名字和传入对象名字以及"total score is higher than"
            System.out.println(student1.getName() + "'s total score is higher than " + student2.getName());
        } else if (result < 0) { // 如果当前对象总成绩比传入的对象小，输出当前对象名字和传入对象名字以及"total score is lower than"
            System.out.println(student1.getName() + "'s total score is lower than " + student2.getName());
        } else { // 如果两个对象总成绩相等，输出当前对象名字和传入对象名字以及"total score is equal to"
            System.out.println(student1.getName() + "'s total score is equal to " + student2.getName());
        }
    }
}
