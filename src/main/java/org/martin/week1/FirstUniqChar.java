package org.martin.week1;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {

    // s = "leetcode"
    //
    // RECORRIDO 1 — contar frecuencias:
    // 'l' → {l:1}
    // 'e' → {l:1, e:1}
    // 'e' → {l:1, e:2}
    // 't' → {l:1, e:2, t:1}
    // 'c' → {l:1, e:2, t:1, c:1}
    // 'o' → {l:1, e:2, t:1, c:1, o:1}
    // 'd' → {l:1, e:2, t:1, c:1, o:1, d:1}
    // 'e' → {l:1, e:3, t:1, c:1, o:1, d:1}
    //
    // RECORRIDO 2 — buscar el primero con frecuencia 1:
    // índice 0 → 'l' → frecuencia 1 → devuelvo 0 ✅

    public int firstUniqChar(String s) {
        //crear mapa de frecuencias
        Map<Character, Integer> map = new HashMap<>();
        // recorrer s → contar cada letra con getOrDefault
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0 ) + 1);
        }
        // recorrer s de nuevo con índice
        for (int i = 0; i < s.length(); i++) {
            // si mapa.get(s[i]) == 1 → devolver i
            if (map.get(s.charAt(i)) == 1) return i;
        }
        // devolver -1
        return -1;
    }

    // 0(n) / 0(1)


}
