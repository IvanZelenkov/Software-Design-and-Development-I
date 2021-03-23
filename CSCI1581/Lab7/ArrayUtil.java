// Ivan Zelenkov Problem 1,2,3,4,5,6

public class ArrayUtil {

    static void reverse(String[] array) {
        int end = array.length - 1;
        for (int start = 0; start < end; start++) {
            String temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            end--;
        }
    }

    static String[] resize(String[] array) {
        String[] result = new String[array.length * 2];
        for (int i = 0; i < result.length; i++) {
            if (i < array.length) {
                result[i] = array[i];
            }
            else {
                result[i] = null;
            }
        }
        return result;
    }

    static String[] add(String element, String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = element;
                return array;
            }
        }
        String[] newArray = new String[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];// will move all elements of the array list to newArray
        }
        newArray[array.length] = element;// we are talking about assigning the element value to index 3 of the newArray list,
        return newArray;                 // as the last value of the array list after all a, b, c, i.e. if the list were 100 size we would write array.length as the end index of the list to add an element
    }

    static boolean contains(String element, String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    static int findMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (min > value) { // we make the min value exactly greater than any value from the list and the first element of the list that will already be in value is assigned to the min variable
                min = value;
            }
        }
        return min;
    }
    static int findMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }

    static int[] findMinIndex(int[] array) {
        int index = 0;

        int min = findMinValue(array);

        int size = countMinimum(array, min);// variable size will be passed return count;

        int[] answer = new int[size];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }

    static int countMinimum(int[] array, int min) {
        int count = 0;

        for (int i : array) {
            if (i == min) {// do not confuse! the values of the list in the i variable will be compared with the min variable, and not with i as an index
                count++;// if 1, count will be 2
            }
        }
        return count; // size will be 2
    }

    static int[] findMaxIndex(int[] array) {
        int index = 0;

        int max = findMaxValue(array);

        int size = countMaximum(array, max);

        int[] answer = new int[size];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }

    static int countMaximum(int[] array, int max) {
        int count = 0;

        for (int i : array) {
            if (i == max) {
                count++;
            }
        }
        return count;
    }

}