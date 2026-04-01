package org.martin.week1;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    // s = "a n a g r a m"
    //          i
    // mapa = {}
    // 'a' → no está → {a:1}
    // 'n' → no está → {a:1, n:1}
    // 'a' → está   → {a:2, n:1}
    // 'g' → ...
    // 'r' → ...
    // 'a' → ...
    // 'm' → ...

    public static boolean isAnagram(String s, String t) {
        // Si los dos string tienen distinto tamaño → false
        if(s.length() != t.length()) return false;
        // Crear dos mapas para los dos strings
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        // Recorrer un string y guardar cada letra en el mapa
        for (char c : s.toCharArray()){
            // si c existe sumar 1, si no existe inicializar en 1
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // Recorrer el otro string y guardar cada letra en el mapa
        for (char c : t.toCharArray()){
            // si c existe sumar 1, si no existe inicializar en 1
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        // Verificar si son iguales los dos mapas
        return map2.equals(map);
    }


}
