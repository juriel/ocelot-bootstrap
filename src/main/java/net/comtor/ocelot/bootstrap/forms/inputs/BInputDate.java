package net.comtor.ocelot.bootstrap.forms.inputs;

import net.comtor.ocelot.bootstrap.forms.BInput;
import net.comtor.ocelot.html.forms.inputs.HtmlInput;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BInputDate extends BInput {

    public BInputDate(String name, String label) {
        super(HtmlInput.DATE, name, label);
        addAttribute("placeholder", "aaaa-mm-dd");
    }
    
}
