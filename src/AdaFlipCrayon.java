

import java.util.Scanner;

class AdaFlipCrayon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int noOfCases = scanner.nextInt();
		
		for (int i = 0; i < noOfCases; i++) {
			System.out.println(noOfFlips(scanner.next()));
		}
		
		scanner.close();
	}

	public static int noOfFlips(String string) {
		int stringLength = string.length();
		
		int noOfUps = 0, noOfDowns = 0;
		boolean countingUp = false;
		
		for (int i = 0; i < stringLength; i++) {
			if (string.charAt(i) == 'U') {
				if (!countingUp) {
					noOfUps++;
				}
				countingUp = true;
			} else {
				if (countingUp || i == 0) {
					noOfDowns++;
				}
				countingUp = false;
			}
		}
		
		return Math.min(noOfUps, noOfDowns);
	}

}
