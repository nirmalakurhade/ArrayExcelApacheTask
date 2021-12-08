package jbk;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
	static void countCharacter(String input_Array){
	 HashMap<Character,Integer> hm = new HashMap<>();
	 // converting given string to char array
		char[] string_Array = input_Array.toCharArray();
		for(char c : string_Array) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
		} 
			else {
				hm.put(c,1);
			}
		}//print countmap
		for(Map.Entry entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	public static void main(String[] args) {
		String st ="nirmalakurhade";
		countCharacter(st);
	}
}
		