public class bonus2 {
    public static void main(String[] args) {
        int n = 100;
        int group = 4; // Quantity of people in one group
        int count = 0;

        int quantityGroups = n / group; // Quantity of 4-people groups from n people

        for (int person1 = 1; person1 <= quantityGroups - 1; person1++) {
            for (int person2 = person1 + 1; person2 <= quantityGroups; person2++)
                count++;
        }
        System.out.println("Number of combinations possible couples from " + quantityGroups + " groups of 4 people is " + count + ".");
    }
}
