package com.bw.wangqiqi.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @作者:王琪琪
 * @时间:2019年8月13日
 * 
 */
public class Test {
	public static boolean main(String[] args) {
		System.out.println("1");
	/*	* Because TreeNodes are about twice the size of regular nodes, we
	     * use them only when bins contain enough nodes to warrant use
	     * (see TREEIFY_THRESHOLD). And when they become too small (due to
	     * removal or resizing) they are converted back to plain bins.  In
	     * usages with well-distributed user hashCodes, tree bins are
	     * rarely used.  Ideally, under random hashCodes, the frequency of
	     * nodes in bins follows a P oisson distribution
	     * (http://en.wikipedia.org/wiki/Poisson_distribution) with a
	     * parameter of about 0.5 on average for the default resizing
	     * threshold of 0.75, although with a large variance because of
	     * resizing granularity. Ignoring variance, the expected
	     * occurrences of list size k are (exp(-0.5) * pow(0.5, k) /
	     * factorial(k)). The first values are*/

		/*  Map map = new HashMap<id, 1>();*/
		 
		String string1 = "111";
		for (int i = 0; i < string1.length(); i++) {
			if(string1!=null ||string1!=""){
				return true;
			}
		}
		for (String string : args){
			System.out.println("1");
		}
		return false;
		
	  
		
	}
	 
	

}
