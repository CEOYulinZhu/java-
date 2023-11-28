import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        LinkedList<Integer> circle = new LinkedList<>();
        for (int i = 1; i <= m; i++) {
            circle.add(i);
        }
        int index = 0;
        while (circle.size() > 1) {
            index = (index + n - 1) % circle.size();
            circle.remove(index);
        }
        System.out.println("最后剩下的是" + m + "人中的第" + circle.get(0) + "个人");
    }
}
