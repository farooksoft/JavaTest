package com.test.day4;

public class DeathServiceCounter implements ServiceCounter{
	Hospital hospital; Police police; Corporation corporation;
	
	public DeathServiceCounter(Hospital hospital, Police police,Corporation corporation) {
		this.corporation = corporation;
		this.hospital = hospital;
		this.police = police;
	}
	public void execute(){
		police.deathInvestigation();
		hospital.giveDeathClearance();
		corporation.giveDeathCertificate();
	}
}
