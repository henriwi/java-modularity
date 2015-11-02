package no.bekk.main;

import java.util.Iterator;
import java.util.ServiceLoader;
import no.bekk.api.Api;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) {
    	ServiceLoader sl = ServiceLoader.load(Api.class);
			Iterator<Api> iter = sl.iterator();
			if (!iter.hasNext())
				throw new RuntimeException("No service providers found!");

			while (iter.hasNext()) {
				iter.next().open();
			}
    }
}