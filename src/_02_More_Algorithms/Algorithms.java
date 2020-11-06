package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int i = eggs.indexOf("cracked");
		return i;
	}

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int pearls = 0;
		for(int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)) {
				pearls += 1;
			}
		}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		Double tallest = 0.0;
		for(int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i)> tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;	
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		int length = 0;
		String word = "";
		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).length()>length) {
				length = words.get(i).length();
				word = words.get(i);
			}
		}
		return word;
	}

	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		for(int i = 0; i < message1.size(); i++) {
			if(message1.get(i).equals("... --- ...")) {
				return true;
			}
		}
		return false;
	}
}
