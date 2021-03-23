public class Homework3 {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;

        for (int person1 = 1; person1 <= n-3; person1++) {
            for (int person2 = person1 + 1; person2 <= n-2; person2++)
                for (int person3 = person2 + 1; person3 <= n-1; person3++)
                    for (int person4 = person3 + 1; person4 <= n; person4++)
                        count++;
        }
        System.out.println("Number of combinations possible groups of 4 people is " + count + ".");
    }
}