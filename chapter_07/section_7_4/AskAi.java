package chapter_07.section_7_4;

public class AskAi {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("書名を入力してください: ");
        String title = scanner.nextLine();

        System.out.print("ページ数を入力してください: ");
        String pagesText = scanner.nextLine();
        int pages = Integer.parseInt(pagesText);

        System.out.println("『" + title + "』は " + pages + " ページです");
        System.out.println("1日30ページなら " + (pages / 30) + " 日かかります");
    }
}
