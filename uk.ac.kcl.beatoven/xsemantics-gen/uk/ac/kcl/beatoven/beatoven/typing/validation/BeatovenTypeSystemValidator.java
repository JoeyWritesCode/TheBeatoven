package uk.ac.kcl.beatoven.beatoven.typing.validation;

import com.google.inject.Inject;
import org.eclipse.xsemantics.runtime.validation.XsemanticsValidatorErrorGenerator;
import uk.ac.kcl.beatoven.beatoven.typing.BeatovenTypeSystem;
import uk.ac.kcl.beatoven.beatoven.validation.AbstractBeatovenValidator;

@SuppressWarnings("all")
public class BeatovenTypeSystemValidator extends AbstractBeatovenValidator {
  @Inject
  protected XsemanticsValidatorErrorGenerator errorGenerator;
  
  @Inject
  protected BeatovenTypeSystem xsemanticsSystem;
  
  protected BeatovenTypeSystem getXsemanticsSystem() {
    return this.xsemanticsSystem;
  }
}
