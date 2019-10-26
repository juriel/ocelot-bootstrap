package net.comtor.ocelot.bootstrap.forms.inputs;

import net.comtor.ocelot.bootstrap.forms.BInput;
import net.comtor.ocelot.html.forms.inputs.HtmlInput;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BInputNumber extends BInput {

    
    public BInputNumber(String label, String nameAndId, String help, String error) {
        super(HtmlInput.NUMBER, label, nameAndId, help, error);
    }

    public BInputNumber(String label, String nameAndId, String help) {
        this(label, nameAndId, help, null);
    }

    public BInputNumber(String label, String nameAndId) {
        this(label, nameAndId, null);
    }
}
