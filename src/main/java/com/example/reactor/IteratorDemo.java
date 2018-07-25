package com.example.reactor;

import java.util.Iterator;
import java.util.List;

/**
 * {@link Iterator} Demo
 * @author Administrator
 *
 */
public class IteratorDemo {
	
	public static void main(String[] args) {
		
		//数据源
		//java 9 API
		List<Integer> values = List.of(1, 2, 3, 4, 5, 6);
		
		//迭代
		//消费数据
		Iterator<Integer> iterator = values.iterator();
		while (iterator.hasNext()) {//这个过程就是向服务器请求是否还有数据
			
			Integer value = iterator.next();//主动获取数据
			System.out.println(value);
		}
		
	}

}
