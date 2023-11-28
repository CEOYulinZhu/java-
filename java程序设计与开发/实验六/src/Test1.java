import java.util.*;

public class Test1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputStrings = new ArrayList<>();

        System.out.println("请输入字符串(输入end结束): ");
        String input = scanner.next();
        while (!input.equals("end")) {
            inputStrings.add(input);

            input = scanner.next();
        }

        Collections.sort(inputStrings); // 字典序排序
        Collections.reverse(inputStrings); // 倒序

        System.out.println("按字典序倒序后的结果为");
        for (String str : inputStrings) {
            System.out.print(str+" ");
        }
    }
}
