package net.comtor.ocelot.bootstrap.forms.inputs;

import net.comtor.ocelot.bootstrap.forms.BInput;
import net.comtor.ocelot.html.forms.inputs.HtmlInput;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BInputTime extends BInput {

    public BInputTime(String label, String nameAndId, String help, String error) {
        super(HtmlInput.TIME, label, nameAndId, help, error);
    }

    public BInputTime(String label, String nameAndId, String help) {
        this(label, nameAndId, help, null);
    }

    public BInputTime(String label, String nameAndId) {
        this(label, nameAndId, null);
    }
}
