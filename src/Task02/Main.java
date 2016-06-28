package Task02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();

		String[] words = text.split(" ");

		List<String> list = new ArrayList<String>();

		for (String a : words)
			list.add(a);

		Set<String> uniqueSet = new HashSet<String>(list);
		for (String a : uniqueSet)
			System.out.println(a);

		input.close();

	}

}