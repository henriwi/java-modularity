package no.bekk.mod1;

import no.bekk.api.module.Api;

public class Mod1 implements Api {
	
	@Override
	public void open() {
		System.out.println("Hello from Mod1!");
	}
	
}