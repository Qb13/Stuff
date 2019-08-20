package stuff;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.close();
		List<Integer> q = new LinkedList<>();
		Map<Integer, String> map = new HashMap<>();
		q.add(8);
		q.add(2);
		q.add(5);
		q.add(9);
		System.out.println(q);
		q.sort(null);
		System.out.println(q);
	}
}
