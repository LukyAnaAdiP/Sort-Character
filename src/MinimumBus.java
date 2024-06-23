import java.util.Scanner;

public class MinimumBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of families: ");
        int n = scanner.nextInt();

        System.out.print("Input the number of members in the family (separated by a space): ");
        scanner.nextLine();
        String[] membersStr = scanner.nextLine().split(" ");

        if (membersStr.length != n){
            System.out.println("Input must be equal with count of family");
            return;
        }

        int[] members = new int[n];
        for (int i = 0; i < n; i++){
            members[i] = Integer.parseInt(membersStr[i]);
        }

        int[] freq = new int[5];
        for (int m: members){
            freq[m]++;
        }

        int busCount = 0;

        busCount += freq[4];

        int minThreeAndOne = Math.min(freq[3], freq[1]);
        busCount += minThreeAndOne;
        freq[3] -= minThreeAndOne;
        freq[1] -= minThreeAndOne;

        busCount += freq[3];

        busCount += freq[2] / 2;
        freq[2] %= 2;

        busCount += (freq[1] + 3) / 4;

        System.out.println("Minimum bus required is : " + busCount);

    }
}
