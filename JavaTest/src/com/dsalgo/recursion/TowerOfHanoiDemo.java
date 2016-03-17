package com.dsalgo.recursion;

/**
 * Logic is :
 * 1. Move n-1 disks from a to b using c
 * 2. Move a disk from a to c
 * 3. Move n-1 disks from b to using a
 * 
 * @author srayabar
 *
 */
public class TowerOfHanoiDemo {
	
	public static void main(String[] args) {
		new TowerOfHanoiDemo().towerOfHanoi(5, 1, 2, 3);
	}

	public void towerOfHanoi(int disksNumber, int a, int b, int c){
		
		if(disksNumber > 0){
			towerOfHanoi(disksNumber-1, a, c, b);
			System.out.println("move a disk from "+a + " to " + c);
			towerOfHanoi(disksNumber-1, b, a, c);
		}
		
	}
}
