package org.martin.week1;

public class ReverseString {
    //         0     1     2     3     4
    // 1 -> [ 'h'   'e'   'l'   'l'   'o' ]
    //         |                       |

    //         0     1     2     3     4
    // 2 -> [ 'o'   'e'   'l'   'l'   'h' ]
    //               |           |

    //         0     1     2     3     4
    // 3 -> [ 'o'   'l'   'l'   'e'   'h' ]
    //                     ||

    public static void main(String[] args) {

    }

    public static void reverseString(char[] s) {
        // right empieza en el último índice
        int right = s.length - 1;
        // left empieza en 0
        int left = 0;
        // mientras left < right:
        while (left < right){
            // guardamos s[left] en una variable temporal antes de pisarlo
            char aux = s[left];
            //  intercambiar s[left] con s[right]
            s[left] = s[right];
            s[right] = aux;
            //  right--
            right--;
            //  left++
            left++;
        }
    }
}
