package com.dpattern.businessdelegate;

public class DeathCertificateDemo {
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		Police police = new Police();
		Corporation corporation = new Corporation();

		ServiceOffice office = new ServiceOffice();
		DeathServiceCounter counter = new DeathServiceCounter(hospital, police,
				corporation);

		office.setDeathCounter(counter, 1);
		office.useDeathCounter(1);
	}

}
