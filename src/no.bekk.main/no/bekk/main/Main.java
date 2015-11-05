package no.bekk.main;

import java.util.Iterator;
import java.util.ServiceLoader;
import no.bekk.module.Module;

public class Main {
    public static void main(String[] args) {
		ServiceLoader<Module> sl = ServiceLoader.load(Module.class);
		sl.forEach(Module::init);
    }
}