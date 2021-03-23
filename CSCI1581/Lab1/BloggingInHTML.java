// Ivan Zelenkov (Problem 2: Blogging in HTML)
import java.util.*;

public class BloggingInHTML {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String header = scan.nextLine();
        String pathImage = scan.nextLine();
        String text = scan.nextLine();
        String dateText = scan.nextLine();
        String date = scan.nextLine();

        String HTMLOpen = "<html>";
        String HTMLClose = "</html>";
        String BodyOpen = "<body>";
        String BodyClose = "</body>";
        String HeadingOpen = "<h1>";
        String HeadingClose = "</h1>";
        String ImageTag = "<img src='" + pathImage + "' />";
        String ParagraphOpen = "<p>";
        String ParagraphClose = "</p>";
        String SmallOpen = "<small>";
        String SmallClose = "</small>";

        String by = "By ";

        System.out.println(HTMLOpen + BodyOpen + HeadingOpen + header + HeadingClose + ImageTag + ParagraphOpen + text + ParagraphClose + SmallOpen + by + dateText + ", " + date + SmallClose + BodyClose + HTMLClose);
    }
}
