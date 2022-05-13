/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.beatoven.beatoven.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import uk.ac.kcl.beatoven.beatoven.BeatovenRuntimeModule;
import uk.ac.kcl.beatoven.beatoven.BeatovenStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class BeatovenIdeSetup extends BeatovenStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new BeatovenRuntimeModule(), new BeatovenIdeModule()));
	}
	
}