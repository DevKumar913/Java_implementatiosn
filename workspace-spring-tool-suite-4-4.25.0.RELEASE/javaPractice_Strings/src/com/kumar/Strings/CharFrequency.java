package com.kumar.Strings;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
	public void charFreqInString(String str) {
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		
		for(char ch: str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+ ": is repeated ->"+ entry.getValue()+" Time(s).");
		}
	}

	public static void main(String[] args) {
		CharFrequency obj = new CharFrequency();
		obj.charFreqInString("hello");

	}

}
