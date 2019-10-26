package net.comtor.ocelot.bootstrap.forms.inputs;

import net.comtor.ocelot.bootstrap.forms.BInput;
import net.comtor.ocelot.html.forms.inputs.HtmlInput;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BInputSearch extends BInput {

    public BInputSearch(String label, String nameAndId, String help, String error) {
        super(HtmlInput.SEARCH, label, nameAndId, help, error);
    }

    public BInputSearch(String label, String nameAndId, String help) {
        this(label, nameAndId, help, null);
    }

    public BInputSearch(String label, String nameAndId) {
        this(label, nameAndId, null);
    }
}
