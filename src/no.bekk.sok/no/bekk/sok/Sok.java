package no.bekk.sok;

import no.bekk.api.module.Api;

public class Sok implements Api {
	
	@Override
	public void open() {
		System.out.println("Hello from Search module!");
	}
	
}