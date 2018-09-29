package com.practice.java.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class DuplicateItem {

	public static void main(String[] args) {

		int numbArray[] = {2,34,56,65,78,108,34,56,46,105,108,78,78,65,108,150,165,205,105,56,45,56,89,56,98,108};
		int numbLength = numbArray.length;
		
		//*******Mathod1:- Duplicate numbers using each item iteration & HashMap (Takes more time)
		HashMap<Integer, Integer> dupliMap = new HashMap<Integer, Integer>();
		for (int i=0; i<numbLength-1; i++) {

			if(dupliMap.containsKey(numbArray[i])) continue;

			for(int j=1;j<numbLength;j++) {
				if(numbArray[i] == numbArray[j] && i!=j) {

					if(dupliMap.containsKey(numbArray[i])) {
						dupliMap.put(numbArray[i], dupliMap.get(numbArray[i]) + 1);
					}else {
						dupliMap.put(numbArray[i], 2);
					}
				}
			}
		}

		System.out.println("Duplicate numbers using each item iteration & HashMap: ");
		for(Map.Entry<Integer, Integer> mapEntry : dupliMap.entrySet()) {
			System.out.println(mapEntry.getKey() +" : "+ mapEntry.getValue());
		}

		
		//*******Mathod1:- Duplicate numbers using set & HashTable (More efficient)
		//******** HashMap or HashTable doesn't impact on execution
		HashSet<Integer> dupliSet = new HashSet<Integer>();
		Hashtable<Integer, Integer> dupliTable = new Hashtable<Integer, Integer>();
		for(int k=0; k<numbLength; k++) {
			
			if(dupliSet.add(numbArray[k])) {
			}else {
				if(dupliTable.containsKey(numbArray[k])) {
					dupliTable.put(numbArray[k], dupliTable.get(numbArray[k]) + 1);
				}else {
					dupliTable.put(numbArray[k], 2);
				}
			}
		}

		System.out.println("Duplicate numbers using set & HashTable: ");
		Set<Integer> keys = dupliTable.keySet();
		for(Integer key: keys){
			System.out.println(key +" : "+ dupliTable.get(key));
		}
	}
}
