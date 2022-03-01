package com.zyf.algorithm.datastructure;

import java.util.Stack;

/**
 * 括号匹配
 */
public class Solution {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>() ;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '['||c=='('||c=='{'){
                stack.push(c);
            }else{
                if (stack.isEmpty())
                    return false;
                char peek = stack.peek();
                if (peek=='{'&& c=='}'||peek=='['&& c==']'||peek=='('&& c==')'){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String test = "({}){}[]";
        boolean isValid = isValid(test);
        System.out.println("测试数据："+test +" 是否符合要求="+isValid);
    }
}
