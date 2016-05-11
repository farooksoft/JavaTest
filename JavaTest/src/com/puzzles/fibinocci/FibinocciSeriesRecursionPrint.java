package com.puzzles.fibinocci;

public class FibinocciSeriesRecursionPrint {
	
	public static void main(String[] args) {
		System.out.println(findFibinocciSeriesElement(10));
	}
	public static int findFibinocciSeriesElement(int index) {
		if(index == 1 ){
			return 0;
		}
		if(index == 2 ){
			return 1;
		}
		return (findFibinocciSeriesElement(index-1)+findFibinocciSeriesElement(index-2));
	}
}