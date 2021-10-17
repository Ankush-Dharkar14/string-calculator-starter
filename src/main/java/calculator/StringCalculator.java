package calculator;

class StringCalculator {

	public int add(String numbers) {
		String[] inputNumbers = numbers.split(",");
		if (isEmpty(numbers)) {
			return 0;
		}
		if (numbers.length() == 1) {
			return convertStringToInt(numbers);
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
			sum += convertStringToInt(noOfValues);
		}
		return sum;

	}

}