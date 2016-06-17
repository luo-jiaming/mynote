package com.liuyong666.offer;

public class Offer09_3 {
	/**
	 * 变态跳台阶
	 * 题目描述
	 * 		一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
	 * 		求该青蛙跳上一个n级的台阶总共有多少种跳法。
	 * 
	 * 分析：
	 * 		数学归纳法
	 * 		当n=1时，跳法只有1种，用f(1)=f(1-1)=1表示，下同；
	 * 		当n=2时，可以一次跳1级，跳两次，也可以一次两2级，跳法有2种，f(2) = f(2-1) + f(2-2)；
	 * 		//f(2-1)表示在有2级台阶的时候，第一次跳1级的跳法，其他类似
	 * 		当n=3时，可以一次跳1级，跳3次，可以一次跳2级，下一次再跳1级，当然也可以一次跳3级，跳1次，所以跳法是f(3)=f(3-1)+f(3-2)+f(3-3)
	 * 		……
	 * 		当n=k的时候，f(k)=f(k-1)+f(k-2)+f(k-3)+…..+f(k-(k-1))+f(k-k)
	 * 					=f(0)+f(1)+f(2)+……+f(k-1)，
	 * 			而f(k-1)=f((k-1)-1)+f((k-1)-2)+……+f((k-1)-(k-2))+f((k-1)-(k-1))
	 * 					=f(0)+f(1)+f(2)+……+f(k-2)，
	 * 		所以f(k)=2*f(k-1)。
	 */
	
    public int JumpFloorII(int target) {
    	if(target <= 0) {
    		return -1;
    	}
    	int res = 1;
    	for(int i = 0; i < target - 1; i++){
    		res *= 2;
    	}
    	return res;
    }

}
