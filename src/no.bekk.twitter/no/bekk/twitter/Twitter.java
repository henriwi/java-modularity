package no.bekk.twitter;

import no.bekk.module.Module;

public class Twitter implements Module {
	
	@Override
	public void init() {
		System.out.println("Hello from Twitter module!");
	}
	
}