package _02_More_Algorithms;

import java.awt.List;
import java.util.ArrayList;

public class SearchingMethods {
	public int eggSearch(List eggs) {
		int n = eggs.HEIGHT;
		for(int i = 0; i < n; i++) {
			if(((Object) eggs).get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}
	
	
}
