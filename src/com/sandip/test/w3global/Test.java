package com.sandip.test.w3global;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Test {
	// Example: for the following input
	// Some items in the order cannot be shipped. ELEC-TV-239754, SA-Toas-65289 and
	// m-Fil-25420.
	// the output should be ELEC-TV-239754; SA-Toas-65289; m-Fil-25420

	public static void main(String[] args) {
		String regex_pattern = "[a-zA-Z]-[a-zA-Z]+-[0-9]{5,6}";
		Pattern p = Pattern.compile(regex_pattern);
		Scanner input = new Scanner(System.in);
		String inputStr = input.nextLine();
		List<String> tags = new ArrayList<>();
		Matcher m = p.matcher(inputStr);
		while (m.find()) {
			String part1 = m.group();
			tags.add(part1.trim());
		}

		String output = tags.stream().collect(Collectors.joining("; "));
		System.out.println(output);

	}

}
