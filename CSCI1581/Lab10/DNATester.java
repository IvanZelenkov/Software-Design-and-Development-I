// Ivan Zelenkov Problem 3 (DNA)

public class DNATester {
    public static void main(String[] args) {
        char[] first = {'a', 't', 'c', 'g'};
        DNA d1 = new DNA(first);
        char[] second = {'t', 'c', 'a', 'a'};
        DNA d2 = new DNA(second);
        String out = d1.toString();
        System.out.println(out);
        DNA nextDNA = d1.swap(d2, 2);
        String newOut = nextDNA.toString();
        System.out.println(newOut);
    }
}
