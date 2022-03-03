package com.zyf.algorithm.leetcode;

public class SolutionRomanToInt {

    public int romanToInt(String s) {
        int result = 0;
        int leftInt = 0;
        for (int i = 0; i < s.length(); i++) {
            char next = s.charAt(i);
            int charInt = CharToInt(next);

            if (charInt > leftInt) {
                result = result - 2*leftInt +charInt;
            } else {
                result = result + charInt;
            }
            leftInt = charInt;
        }
        return result;
    }

    private int CharToInt(Character character) {
        if (character=='I'){
            return 1;
        }else if (character == 'V'){
            return 5;
        }else if (character == 'X'){
            return 10;
        }else if (character == 'L'){
            return 50;
        }else if (character == 'C'){
            return 100;
        }else if (character == 'D'){
            return 500;
        }else if (character == 'M'){
            return 1000;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("II==="+new SolutionRomanToInt().romanToInt("II"));
        System.out.println("XII==="+new SolutionRomanToInt().romanToInt("XII"));
        System.out.println("XXVII==="+new SolutionRomanToInt().romanToInt("XXVII"));
        System.out.println("IX==="+new SolutionRomanToInt().romanToInt("IX"));
        System.out.println("LVIII==="+new SolutionRomanToInt().romanToInt("LVIII"));
        System.out.println("MCMXCIV==="+new SolutionRomanToInt().romanToInt("MCMXCIV"));
        System.out.println("XLIX==="+new SolutionRomanToInt().romanToInt("XLIX"));
        System.out.println("CMXCIX ==="+new SolutionRomanToInt().romanToInt("CMXCIX "));
    }
}
