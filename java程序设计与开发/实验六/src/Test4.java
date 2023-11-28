import java.util.*;

public class Test4 {

    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();

        Random random = new Random();

        // 生成40个学生的成绩并存入map中
        for (int i = 1; i <= 40; i++) {
            int score = 60 + random.nextInt(41); // 生成60-100的随机成绩
            String studentId = "20200429" + String.format("%02d", i);
            studentScores.put(studentId, score);
        }

        // 将学生成绩排序
        List<Map.Entry<String, Integer>> list = new ArrayList<>(studentScores.entrySet());
        list.sort((a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                return a.getKey().compareTo(b.getKey());
            } else {
                return b.getValue().compareTo(a.getValue());
            }
        });

        // 打印排序后的学生成绩
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println("学号：" + entry.getKey() + "，成绩：" + entry.getValue());
        }
    }
}
