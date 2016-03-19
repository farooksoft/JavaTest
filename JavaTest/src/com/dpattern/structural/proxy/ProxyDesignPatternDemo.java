package com.dpattern.structural.proxy;

public class ProxyDesignPatternDemo {
	public static void main(String[] args) {
		InternetProxy proxy = new InternetProxy();
		proxy.connectTo("virus.com");
		proxy.connectTo("google.com");
	}
}