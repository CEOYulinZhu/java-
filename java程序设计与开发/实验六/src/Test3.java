import java.util.ArrayList;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // 生成5个1至20之间的随机整数，且不能重复
        while (list.size() < 5) {
            int random = (int) (Math.random() * 20) + 1;
            if (!list.contains(random)) {
                list.add(random);
            }
        }

        // 自定义排序算法
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        // 输出排序后的集合
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}
