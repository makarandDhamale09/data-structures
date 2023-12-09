package main.java.leetCodeQuestions;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringNo3 {

    public static void main(String[] args) {
        int ans = lengthOfLongestSubstring("pwwkew");
        System.out.println(ans);
    }

    /**
     *  Done this changes by considering a sub array giving left
     *  pointer and right pointer and adding that data to a set
     *  if the left pointer is already in set remove that element
     *  from set and move left pointer one step to right
     *
     */
    public static int lengthOfLongestSubstring(String s) {
        int l=0;
        int ans= 0;
        Set<Character> set= new HashSet<>();
        char[] arr = s.toCharArray();
        for(int r=0; r< s.length();){
            while(set.contains(arr[r])){
                set.remove(arr[l]);
                l++;
            }
            set.add(arr[r]);
            ans= Math.max(ans, r-l+1);
            r++;
        }
        return ans;
    }
}
