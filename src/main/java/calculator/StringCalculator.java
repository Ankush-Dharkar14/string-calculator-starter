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
		return sumValues(inputNumbers[0],inputNumbers[1]);
	}

	private boolean isEmpty(String num) {
		return num.isEmpty();
	}

	private int convertStringToInt(String num) {
		return Integer.parseInt(num);
	}

	private int sumValues(String num1,String num2) {
		return convertStringToInt(num1)+convertStringToInt(num2);
		 

	}

}