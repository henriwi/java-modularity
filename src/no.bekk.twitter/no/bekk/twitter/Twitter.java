package no.bekk.twitter;

import no.bekk.api.module.Api;

public class Twitter implements Api {
	
	@Override
	public void open() {
		System.out.println("Hello from Twitter module!");
	}
	
}