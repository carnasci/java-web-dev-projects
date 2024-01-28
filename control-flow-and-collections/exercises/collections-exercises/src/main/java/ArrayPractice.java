import java.util.*;


public class ArrayPractice {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
                add(6);
                add(7);
                add(8);
                add(9);
                add(10);
            }
        };

        sumEven(arrayList);

        int[] intArray = {1, 2, 3, 4, 5, 8};

        printArray(intArray);

        printOddNums(intArray);

        String phrase = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));

        printWordOfLength(phrase, 5);

        Scanner input = new Scanner(System.in);
        System.out.println("What length of word would you like to search for? ");

        int length = input.nextInt();

        printWordOfLength(phrase, length);
    }

    int[] intArray = {1, 2, 3, 4, 5, 8};

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void printOddNums(int[] array) {
        for (int i : array) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void sumEven(ArrayList<Integer> arrayList) {
        int total = 0;
        for (int i : arrayList) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println(total);
    }

    public static void printWordOfLength(String phrase, int length) {
        String[] wordsArray = phrase.split(" ");

        for (String i : wordsArray) {
            if (i.length() == length) {
                System.out.println(i);
            }
        }
    }

}
