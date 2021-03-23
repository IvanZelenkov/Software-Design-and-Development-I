public class bonus1 {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;

        for (int person1 = 1; person1 <= n-4; person1++) {
            for (int person2 = person1 + 1; person2 <= n-3; person2++)
                for (int person3 = person2 + 1; person3 <= n-2; person3++)
                    for (int person4 = person3 + 1; person4 <= n-1; person4++)
                        for (int person5 = person4 + 1; person5 <= n; person5++)
                        count++;
        }
        System.out.println("Number of combinations possible groups of 5 people is " + count + ".");
    }
}
