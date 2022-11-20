// Print the word with odd letters as follows
//     p             p
//       r         r
//         o    o
//           g
//         r    r
//       a        a
//     m            m

import java.util.*;

class xpattern {
    public static void main(String[] args) {
        System.out.println("Enter a string of odd length: ");
        Scanner read = new Scanner(System.in);
        String str = read.next();
        read.close();

        pattern(str);
    }

    static void pattern(String str) {
        int len = str.length();
        int start = 0;
        int end = len * 2 - 2;

        int j = 0;
        while (j < len) {
            char ch = str.charAt(j);
            // System.out.println(ch);
            for (int i = 0; i <= len * 2 - 2; i++) {
                if (i == start)
                    System.out.print(ch);
                else if (i == end)
                    System.out.print(ch);
                else
                    System.out.print(" ");
                if (i == len * 2 - 2)
                    System.out.println();
            }

            start += 2;
            end -= 2;
            j++;
        }
    }
}

/*
 * 1.iterate till strlen*2-2, that is, if strlen=14, iterate till 12 times;
 * 2.keep a start var at initial and end var at last index. These two var should
 * increment and decrement 2 positions for each line;
 * 3.for each last iteration in for loop, go to new line.
 * 4.rest is history
 */
