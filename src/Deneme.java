import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bumperLength = scanner.nextInt();
        scanner.nextLine();

        while (bumperLength < 1 || bumperLength > 200000) {
            bumperLength = scanner.nextInt();
            scanner.nextLine();
        }

        String bumperDraft = scanner.nextLine();

        if (bumperDraft.length() != bumperLength) {
            return;
        }

        char[] bumperArray = bumperDraft.toCharArray();
        int possibleFall = 0;

        int leftIndex = 0;
        while (leftIndex < bumperLength && bumperArray[leftIndex] == '<') {
            possibleFall++;
            leftIndex++;
        }

        int rightIndex = bumperLength - 1;
        while (rightIndex >= 0 && bumperArray[rightIndex] == '>') {
            possibleFall++;
            rightIndex--;
        }

        System.out.println(possibleFall);
    }
}
