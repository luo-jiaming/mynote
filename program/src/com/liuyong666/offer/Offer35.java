package com.liuyong666.offer;

import java.util.HashMap;
import java.util.Map;

public class Offer35 {
	/*
	 * 第一个只出现一次的字符位置
	 * 
	 * 题目描述：
	 * 		在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符的位置。
	 * 		若为空串，返回-1。位置索引从0开始
	 * 思路：
	 * 		利用哈希表保存各个字符出现的次数
	 */

	public int firstNotRepeatingChar(String str) {
        if(str == null || str.length() == 0){
            return -1;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            Character ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch, 1);
            }
        }
        for(int i = 0; i < str.length(); i++){
            if(map.get(str.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
        
    }
}
