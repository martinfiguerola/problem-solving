package org.martin.week1;

public class SingleNumber {

    // ¿Qué tengo y qué me piden? -> [2, 1, 2] ->  1 -> non-repeated number
    // ¿Restricciones importantes? -> A solution with a linear runtime complexity and use only constant extra space.
    // [2, 1, 2] -> 1
    // result = 0
    // result = 0 ^ 2 = 2    // el 2 entró
    // result = 2 ^ 1 = 3    // el 1 entró
    // result = 3 ^ 2 = 1    // el segundo 2 canceló al primero
    // Al final result = 1  que es exactamente el número sin pareja.

    public int singleNumber(int[] nums) {
        // inicializar result en 0
        int result = 0;
        // recorrer cada elemento del array
        for (int element : nums) {
            // result = result ^ elemento
            result = result ^ element;
        }
        // devolver result
        return result;
    }

    public static void main(String[] args) {
        SingleNumber solution = new SingleNumber();
        System.out.println(solution.singleNumber(new int[] {2, 1, 2})); // 1
    }
}
