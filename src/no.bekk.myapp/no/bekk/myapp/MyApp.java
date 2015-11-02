package no.bekk.myapp;

import no.bekk.api.Api;

public class MyApp implements Api {
	
	@Override
	public void open() {
		System.out.println("MyApp!");
	}
	
}