package chapter_08.section_8_3;

public class RoundAi {
    public static void main(String[] args) {
        double average = 26.6;
        int display = (int) average;

        System.out.println("1日あたりの平均ページ数: " + average);
        System.out.println("表示用に整数へ: " + display);
        System.out.println("切り捨てなので、26.9でも " + (int) 26.9 + " になります");
    }
}
