package calculator;

class StringCalculator {
	 int count=0;
	public int add(String numbers) {
		count++;
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
		boolean flag=false;
		String msg="";
		for (String noOfValues : nums) {
			int temp = convertStringToInt(noOfValues);
			if(temp<0) {
				flag=true;
				msg+=(" "+noOfValues);	
			}
			else {
			sum += temp;
			}
		}
		if(flag) {
			System.out.println("Negatives not Allowed"+msg);
		}
		return sum;
	}
	
	 public int GetCalledCount() {
		 return count;
	 }

}