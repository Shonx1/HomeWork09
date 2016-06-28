package Task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 20; i++)
			list.add(input.nextLine());

		Set<String> uniqueSet = new HashSet<String>(list);
		for (String temp : uniqueSet) {
			System.out.println(temp + ": " + Collections.frequency(list, temp));
		}

		input.close();

	}

}