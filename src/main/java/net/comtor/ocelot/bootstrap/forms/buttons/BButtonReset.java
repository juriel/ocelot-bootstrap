package net.comtor.ocelot.bootstrap.forms.buttons;

import net.comtor.ocelot.html.forms.inputs.HtmlInput;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BButtonReset extends BButton {

    public BButtonReset(String value) {
        super(value);
        setType(HtmlInput.RESET);
    }

}
