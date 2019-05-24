package test;

public class AlternativeStrMerge {

	public static String merge(String s1, String s2) {
		StringBuilder finalString = new StringBuilder();
		int i = 0, j = 0;
		while (i < s1.length() && j < s2.length()) {
			finalString.append(s1.charAt(i++));
			finalString.append(s2.charAt(j++));
		}
		if (i != s1.length()) {
			finalString.append(s1.substring(i));
		}
		if (j != s2.length()) {
			finalString.append(s2.substring(j));
		}

		return finalString.toString();

	}

	public static void main(String args[]) {
		String s1 = "NaaN";
		String s2 = "mopter";
		System.out.println(merge(s1, s2));

	}

}
