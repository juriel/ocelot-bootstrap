package net.comtor.ocelot.bootstrap.forms.inputs;

import net.comtor.ocelot.bootstrap.forms.BInput;
import net.comtor.ocelot.html.forms.inputs.HtmlInput;

/**
 *
 * @author juandiego@comtor.net
 * @since 1.8
 * @version Dec 15, 2020
 */
public class BInputColor extends BInput {

    public BInputColor(String label, String nameAndId, String help, String error) {
        super(HtmlInput.COLOR, label, nameAndId, help, error);
    }

    public BInputColor(String label, String nameAndId, String help) {
        this(label, nameAndId, help, null);
    }
}
