package chapter_08.section_8_4;

public class AverageAi {
    public static void main(String[] args) {
        int totalPages = 532;
        int bookCount = 20;
        int wrong = totalPages / bookCount;
        double right = totalPages / (double) bookCount;

        System.out.println("合計ページ数: " + totalPages);
        System.out.println("冊数: " + bookCount);
        System.out.println("整数どうしで割った: " + wrong);
        System.out.println("片方を小数にして割った: " + right);
    }
}
