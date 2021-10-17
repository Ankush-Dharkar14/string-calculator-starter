package calculator;

class StringCalculator {
	public int add(String numbers) {

		if (isEmpty(numbers)) {
			return 0;
		}

		if (numbers.length() == 1) {
			return convertStringToInt(numbers);
		}

		String delimiter = ",|\n|;";
		String[] inputNumbers = numbers.split(delimiter);
		try {
			int a = convertStringToInt(inputNumbers[0]);
		} catch (NumberFormatException e) {
			delimiter = numbers.split("\n", 2)[0];
			if (delimiter.charAt(0) == '/') {
				delimiter = delimiter.substring(2, delimiter.length());
			}
			inputNumbers = numbers.split("\n", 2)[1].split(delimiter);
		}

		return sumValues(inputNumbers);
	}

	private boolean isEmpty(String num) {
		return num.isEmpty();
	}

	private int convertStringToInt(String num) {
		return Integer.parseInt(num);
	}

	private int sumValues(String[] nums) {
		int sum = 0;

		for (String noOfValues : nums) {
			int temp = convertStringToInt(noOfValues);
			sum += temp;
		}
		return sum;
	}

}