import java.util.Scanner;

public class SymmetricString {
    public static void main(String[] args) {
        // 使用Scanner接收用户输入
        Scanner scanner = new Scanner(System.in);

        // 获取字符串输入
        String inputString = scanner.nextLine();

        // 判断字符串是否对称
        if (isSymmetric(inputString)) {
            System.out.println("该字符串是对称的");
        } else {
            System.out.println("该字符串是不对称的");
        }

        // 关闭Scanner
        scanner.close();
    }

    /**
     * 判断字符串是否对称
     *
     * @param str 要判断的字符串
     * @return 是否对称
     */
    public static boolean isSymmetric(String str) {
        // 获取字符串长度
        int length = str.length();

        // 从字符串的两端向中间比较字符是否对称
        for (int i = 0; i < length / 2; i++) {
            // 比较对称位置上的字符是否相等
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                // 如果不相等，则字符串不对称
                return false;
            }
        }

        // 如果循环完成没有返回false，则字符串是对称的
        return true;
    }
}
