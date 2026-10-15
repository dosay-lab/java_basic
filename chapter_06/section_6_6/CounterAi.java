package chapter_06.section_6_6;

public class CounterAi {
    public static void main(String[] args) {
        int readPages = 0;
        int finishedBooks = 0;

        readPages += 30;
        readPages += 45;
        finishedBooks++;

        System.out.println("読んだページ数: " + readPages);
        System.out.println("読み終わった冊数: " + finishedBooks);
    }
}
