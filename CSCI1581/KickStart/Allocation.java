/*public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        for (int i = 0; i < T; i++) {
            int end = 0;
            int increment = 1;
            int value = 0;
            int N = input.nextInt();
            int B = input.nextInt();
            ArrayList<Integer> list = new ArrayList<>(N);

            if (N >= 1 && B <= 100000 && B >= 1) {
                for (int j = 0; j < N; j++) {
                    int A = input.nextInt();

                    if (A <= 1000 && A >= 0)
                        list.add(A);
                }
                for (int k = 0; k <= N - 1; k++) {
                    end += list.get(k);
                    if ((end <= B) && (list.get(k) <= B)) {
                        if (k == (N - 1)) {
                            System.out.println("Case #" + increment + ": " + value);
                        }
                        value++;
                        increment++;
                    }
                    else if ((end > B) && (list.get(k) <= B)) {
                        end -= list.get(k);
                    }
                    else {
                        increment++;
                        System.out.println("Case #" + increment + ": " + 0);
                        break;
                    }
                }
            }
        }
    }
}*/

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

class Allocation {
    private static int N;
    private static int A;
    private static int B;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            ArrayList<Integer> houses = new ArrayList<Integer>();
            for (int j = 0; j < A; j++) {
                houses.add(sc.nextInt());
            }
            int no_of_houses = findTheHouses(houses,B);
            System.out.println("Case #"+ (i+1) +": "+no_of_houses);

        }

        sc.close();
    }

    private static int findTheHouses(ArrayList<Integer> houses, int max_cost) {
        Collections.sort(houses);
        int count_budget =0;
        int houses_count=0;
        do{
            count_budget = count_budget +houses.get(houses_count);
            if(count_budget<=max_cost)
                houses_count++;
            else
                break;
        }while(houses.size()>houses_count);

        return houses_count;
    }
}

