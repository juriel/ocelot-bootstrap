package net.comtor.ocelot.bootstrap.forms.buttons;

import net.comtor.ocelot.html.forms.inputs.HtmlInput;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BButtonSubmit extends BButton {

    public BButtonSubmit(String value) {
        super(value);
        setType(HtmlInput.SUBMIT);
    }

}
