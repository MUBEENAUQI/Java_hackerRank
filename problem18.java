// A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

// Given a string , print Yes if it is a palindrome, print No otherwise.

// Constraints

//  will consist at most  lower case english letters.
// Sample Input

// madam
// Sample Output

// Yes

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        A=A.toLowerCase();
        String B="";
        
        for(int i=A.length()-1;i>=0;i--){
            B=B+A.charAt(i);
        }
        //System.out.println(B);
        if(A.equals(B))
        System.out.println("Yes");
        else
        System.out.println("No");
        
    }
}



