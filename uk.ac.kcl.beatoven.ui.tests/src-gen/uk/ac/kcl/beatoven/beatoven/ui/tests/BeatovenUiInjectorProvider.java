/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.beatoven.beatoven.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import uk.ac.kcl.beatoven.ui.internal.BeatovenActivator;

public class BeatovenUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return BeatovenActivator.getInstance().getInjector("uk.ac.kcl.beatoven.beatoven.Beatoven");
	}

}
