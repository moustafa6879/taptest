import java.util.Scanner;

public class EntranceExamination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int passCounter = 0;

        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split(" ");
            String division = input[0];
            int[] scores = new int[5];

            for (int j = 0; j < 5; j++) {
                scores[j] = Integer.parseInt(input[j + 1]);
            }

            if (division.equals("s")) { // Science students
                int totalScienceScore = scores[1] + scores[2];
                int totalScore = scores[0] + totalScienceScore + scores[3] + scores[4];
                if (totalScore >= 350 && totalScienceScore >= 160) {
                    passCounter++;
                }
            } else if (division.equals("l")) { // Humanities students
                int totalHumanitiesScore = scores[3] + scores[4];
                int totalScore = scores[0] + scores[1] + scores[2] + totalHumanitiesScore;
                if (totalScore >= 350 && totalHumanitiesScore >= 160) {
                    passCounter++;
                }
            }
        }

        System.out.println(passCounter);
    }
}

