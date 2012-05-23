package com.day3.morning;

public class DogBiteException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	public DogBiteException(String msg) {
		// TODO Auto-generated constructor stub
		this.msg=msg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "the exception is:"+msg;
	}
}
