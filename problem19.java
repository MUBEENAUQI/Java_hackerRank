// Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

// Function Description

// Complete the isAnagram function in the editor.

// isAnagram has the following parameters:

// string a: the first string
// string b: the second string
// Returns

// boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
// Input Format

// The first line contains a string .
// The second line contains a string .

// Constraints

// Strings  and  consist of English alphabetic characters.
// The comparison should NOT be case sensitive.
// Sample Input 0

// anagram
// margana

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if(a.length()==b.length()){
        a=a.toLowerCase();
        b=b.toLowerCase();
        
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
     
     
     int len=a1.length,f=0;
    for(int i=0;i<len;i++){
   for(int j=i+1;j<len;j++){
      if (a1[j] < a1[i]) {
          char temp = a1[i];
          a1[i]=a1[j];
          a1[j]=temp;
      }
      if (b1[j] < b1[i]) {
          char temp1 = b1[i];
          b1[i]=b1[j];
          b1[j]=temp1;
      }
   }
}
     
     for(int i=0;i<len;i++){
         if (a1[i]!=b1[i])
         f=1;
     }
     if(f==0)
     return true;
     else
     return false;
        }else
        return false;
        
    }
    

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
