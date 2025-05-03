import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bumperLength = scanner.nextInt();
        scanner.nextLine();
        String bumperDraft = scanner.nextLine();

        while (bumperDraft.length() != bumperLength) {
            bumperDraft = scanner.nextLine();
        }

        int possibleFall = 0;

        for (int i = 0; i < bumperLength; i++) {
            int position = i;
            int count=0;
            int avariable=0;
            boolean[] visited = new boolean[bumperLength];
            boolean infiniteLoop = false;

            while (true) {
                if (position < 0 || position >= bumperLength) {
                    possibleFall= fallplusser(possibleFall);
                    break;
                }
                if (visited[position]) {
                    infiniteLoop = true;
                    break;
                }
                visited[position] = true;

                if (bumperDraft.charAt(position) == '>') {
                    position++;
                    count++;
                } else if (bumperDraft.charAt(position) == '<') {
                    position--;
                    count++;
                } else {
                    break;
                }
            }
        }
        System.out.println(possibleFall);
    }
    public static int fallplusser(int fall){
        return ++fall;
    }
}
