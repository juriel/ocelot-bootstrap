package net.comtor.ocelot.bootstrap.forms.inputs;

import net.comtor.ocelot.bootstrap.forms.BInput;
import net.comtor.ocelot.html.forms.inputs.HtmlInput;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BInputPassword extends BInput {

    public BInputPassword(String label, String nameAndId, String help, String error) {
        super(HtmlInput.PASSWORD, label, nameAndId, help, error);
    }

    public BInputPassword(String label, String nameAndId, String help) {
        this(label, nameAndId, help, null);
    }

    public BInputPassword(String label, String nameAndId) {
        this(label, nameAndId, null);
    }
}
