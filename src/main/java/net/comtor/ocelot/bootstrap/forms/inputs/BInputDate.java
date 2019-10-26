package net.comtor.ocelot.bootstrap.forms.inputs;

import net.comtor.ocelot.bootstrap.forms.BInput;
import net.comtor.ocelot.html.forms.inputs.HtmlInput;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BInputDate extends BInput {

    public BInputDate(String label, String nameAndId, String help, String error) {
        super(HtmlInput.DATE, label, nameAndId, help, error);
        getInput().addAttribute("placeholder", "aaaa-mm-dd");
    }

    public BInputDate(String label, String nameAndId, String help) {
        this(label, nameAndId, help, null);
    }

    public BInputDate(String label, String nameAndId) {
        this(label, nameAndId, null);
    }
}
