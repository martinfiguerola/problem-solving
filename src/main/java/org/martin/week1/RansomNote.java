package org.martin.week1;

import java.util.HashMap;
import java.util.Map;

/*
 * 383. Ransom Note — Easy
 * Time: O(n) | Space: O(1)
 *
 * Count letter frequencies in magazine.
 * For each letter in ransomNote, check if available and decrement.
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        // Mapa de frecuencias de magazine
        Map<Character, Integer> map = new HashMap<>(); // { 'a':2, 'b':1 }

        // Recorro primero magazine / "a a b"
        for(char c : magazine.toCharArray()){
            // Magazine -> contar cada letra con getOrDefault()
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Recorro después ransomNote / "a a" / { 'a':0, 'b':1 }
        for (char c : ransomNote.toCharArray()){
            // Si la letra no esta en el mapa o su valor == 0 -> false
            if (!map.containsKey(c) || map.get(c) == 0) return false;
            //            -> si esta -> decrementar su valor
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        // Devolver True
        return true;
    }

    public static void main(String[] args) {
        RansomNote solution = new RansomNote();
        System.out.println(solution.canConstruct("aa", "aab")); // true
        System.out.println(solution.canConstruct("aa", "ab"));  // false
    }


}
