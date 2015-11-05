package no.bekk.main;

import java.util.Iterator;
import java.util.ServiceLoader;
import no.bekk.api.module.Api;

public class Main {
    public static void main(String[] args) {
		ServiceLoader<Api> sl = ServiceLoader.load(Api.class);
			Iterator<Api> iter = sl.iterator();
			if (!iter.hasNext())
				throw new RuntimeException("No service providers found!");

			iter.forEachRemaining(Api::open);
    }
}