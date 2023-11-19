import java.util.Scanner;

public class ArrayToString {
    public static void main(String[] args) {
        // 使用Scanner接收用户输入
        Scanner scanner = new Scanner(System.in);

        // 获取整数数组输入
        String input = scanner.nextLine();
        String[] strArray = input.split("\\s+"); //使用split方法将输入字符串分割为字符串数组

        // 将字符串数组转换为整数数组
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        // 使用逗号连接整数数组元素
        String result = arrayToString(intArray);

        // 输出结果
        System.out.println(result);

        // 关闭Scanner
        scanner.close();
    }

    public static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(",");
            }
        }

        return result.toString();
    }
}
