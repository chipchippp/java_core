package Exercise.Exercise_1;

 class Solution {
     public int Solution(String S) {
         int count_A = countOccurrences(S, 'A')/3;
         int count_B = countOccurrences(S, 'B');
         int count_C = countOccurrences(S, 'C')/2;

         if (count_A == 0 || count_B == 0 || count_C == 0) {
             return 0;
         }
         return Math.min(count_A, Math.min(count_B, count_C));
     }

     public static int countOccurrences(String s, char targetChar) {
         int count = 0;
         for (int i = 0; i < s.length(); i++) {
             if (s.charAt(i) == targetChar) {
                 count++;
             }
         }
         return count;
     }
 }
