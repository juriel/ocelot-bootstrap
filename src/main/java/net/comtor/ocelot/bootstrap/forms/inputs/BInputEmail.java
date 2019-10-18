package net.comtor.ocelot.bootstrap.forms.inputs;

import net.comtor.ocelot.bootstrap.forms.BInput;
import net.comtor.ocelot.html.forms.inputs.HtmlInput;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BInputEmail extends BInput {

    public BInputEmail(String name, String label) {
        super(HtmlInput.EMAIL, name, label);
    }

}
