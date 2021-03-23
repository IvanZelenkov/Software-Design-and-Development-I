// Ivan Zelenkov Problem 7 (CaesarCypher)

public class CaesarCypher {

    public static String encrypt(String message, int key) {
        char[] c = message.toCharArray();
        String answer = "";

        for (char temp : c) {
            answer += (char)(temp + key);
        }
        return answer;
    }

    public static String decrypt(String message, int key) {
        char[] c = message.toCharArray();
        String answer = "";

        for (char temp : c) {
            answer += (char)(temp - key);
        }
        return answer;
    }
}