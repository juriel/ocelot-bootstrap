package net.comtor.ocelot.bootstrap.forms.inputs;

import net.comtor.ocelot.bootstrap.forms.BInput;
import net.comtor.ocelot.html.forms.inputs.HtmlInput;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BInputDatetime extends BInput {

    public BInputDatetime(String name, String label) {
        super(HtmlInput.DATETIMELOCAL, name, label);
    }

}
