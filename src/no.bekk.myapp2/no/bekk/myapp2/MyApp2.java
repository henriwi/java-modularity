package no.bekk.myapp2;

import no.bekk.api.Api;

public class MyApp2 implements Api {
	
	@Override
	public void open() {
		System.out.println("MyApp2!");
	}
	
}