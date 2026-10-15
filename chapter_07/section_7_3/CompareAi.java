package chapter_07.section_7_3;

public class CompareAi {
    public static void main(String[] args) {
        String recordText = "240";
        int record = Integer.parseInt(recordText);
        int today = 180;
        int best = Math.max(record, today);

        System.out.println("これまでの最高: " + record + " ページ");
        System.out.println("今日読んだ: " + today + " ページ");
        System.out.println("記録は " + best + " ページ");
    }
}
