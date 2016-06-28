package Task03;

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

		for (int i = 0; i < 5; i++)
			list.add(input.nextLine());

		Set<String> uniqueSet = new HashSet<String>(list);
		for (String temp : uniqueSet) {
			int a = Collections.frequency(list, temp);
			if (a == 4)
				System.out.print("Kare ");
			else if (a == 3)
				System.out.print("Set ");
			else if (a == 2)
				System.out.print("Chift ");
		}

		input.close();

	}

}