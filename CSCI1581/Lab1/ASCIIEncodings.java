package Lab1;// Ivan Zelenkov (Problem 6: ASCII encodings)
import java.util.*;

public class ASCIIEncodings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value1 = scan.nextInt();
        int value2 = scan.nextInt();
        int value3 = scan.nextInt();
        int value4 = scan.nextInt();
        int value5 = scan.nextInt();
        int value6 = scan.nextInt();

        char name1 = (char) value1;
        char name2 = (char) value2;
        char name3 = (char) value3;
        char name4 = (char) value4;
        char name5 = (char) value5;
        char name6 = (char) value6;

        System.out.print(name1);
        System.out.print(name2);
        System.out.print(name3);
        System.out.print(name4);
        System.out.print(name5);
        System.out.println(name6);
    }
}