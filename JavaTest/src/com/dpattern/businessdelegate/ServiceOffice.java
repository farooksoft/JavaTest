package com.dpattern.businessdelegate;

public class ServiceOffice {
	ServiceCounter[] deathCounter = new ServiceCounter[5];
	ServiceCounter[] collegeCounter = new ServiceCounter[5];

	public ServiceOffice() {
		for (int i = 0; i < 5; i++) {
			deathCounter[i] = new DummyCounter();
		}
		for (int i = 0; i < 5; i++) {
			collegeCounter[i] = new DummyCounter();
		}
	}

	public void setDeathCounter(ServiceCounter scCounter, int slot) {
		deathCounter[slot] = scCounter;
	}

	public void useDeathCounter(int slot) {
		deathCounter[slot].execute();
	}

	public void setCollegeCounter(ServiceCounter scCounter, int slot) {
		deathCounter[slot] = scCounter;
	}

	public void useCollegeCounter(int slot) {
		deathCounter[slot].execute();
	}
}
