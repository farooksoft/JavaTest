package com.core.clone;

import java.io.IOException;

public class CloneScenario {
	public static void main(String[] args) throws IOException {
		Sheep mothersheep = new Sheep();
		Sheep dolly = (Sheep) mothersheep.getClone();
		mothersheep.name = "i am the mother...";
		dolly.name = "i am cute dolly";

		System.out.println(dolly.name);
		System.out.println(mothersheep.fis.available());
		// mothersheep.fis.close();
	}
}
