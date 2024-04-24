package me.monka;

import java.util.ArrayList;

public class Helper {
	public static boolean arrayContainsString(String message, ArrayList<String> ref) {
		for (String str : ref) {
			if (message.toLowerCase().contains(str.toLowerCase())) {
				return true;
			}
		}
		return false;
	}
}
