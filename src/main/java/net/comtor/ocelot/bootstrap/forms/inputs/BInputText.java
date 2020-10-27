package net.comtor.ocelot.bootstrap.forms.inputs;

import net.comtor.ocelot.bootstrap.forms.BInput;
import net.comtor.ocelot.html.forms.inputs.HtmlInput;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BInputText extends BInput {

    public BInputText(String label, String nameAndId, String help, String error) {
        super(HtmlInput.TEXT, label, nameAndId, help, error);
    }

    public BInputText(String label, String nameAndId, String help) {
        this(label, nameAndId, help, null);
    }

    public BInputText(String label, String nameAndId) {
        this(label, nameAndId, null);
    }

    public BInputText(String label, String nameAndId, String help, int maxLength) {
        this(label, nameAndId, help, null);

        addAttribute("maxlength", maxLength + "");
    }

    public BInputText(String label, String nameAndId, int maxLength) {
        this(label, nameAndId, null, maxLength);
    }

}
