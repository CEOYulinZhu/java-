import java.util.Scanner;

public class StringSegmentation {
    public static void main(String[] args) {
        // 使用Scanner接收用户输入
        Scanner scanner = new Scanner(System.in);

        // 获取字符串输入
        System.out.println("请输入需分段的字符串：");
        String inputString = scanner.nextLine();

        // 获取数字输入
        System.out.println("请输入字符个数（作为标准进行分段）：");
        int segmentLength = scanner.nextInt();

        // 创建字符串分段对象
        StringSegmenter segmenter = new StringSegmenter(inputString, segmentLength);

        // 输出分段结果
        segmenter.printSegmentation();

        // 关闭Scanner
        scanner.close();
    }
}

class StringSegmenter {
    private String inputString;
    private int segmentLength;

    public StringSegmenter(String inputString, int segmentLength) {
        this.inputString = inputString;
        this.segmentLength = segmentLength;
    }

    public void printSegmentation() {
        System.out.println("需分段的字符串为 " + inputString);

        // 计算实际分的组数
        int actualSegments = calculateSegments();

        System.out.println("被分段为 " + actualSegments + " 组, 分段后结果为:");

        int length = inputString.length();
        for (int i = 0; i < length; i += segmentLength) {
            int endIndex = Math.min(i + segmentLength, length);
            String segment = inputString.substring(i, endIndex);
            System.out.println(segment);
        }
    }

    private int calculateSegments() {
        int length = inputString.length();
        return (int) Math.ceil((double) length / segmentLength);
    }
}
