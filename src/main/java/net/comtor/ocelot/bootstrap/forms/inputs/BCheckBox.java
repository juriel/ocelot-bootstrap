package net.comtor.ocelot.bootstrap.forms.inputs;

import net.comtor.ocelot.bootstrap.decorators.BootstrapFormElement;
import net.comtor.ocelot.html.forms.inputs.HtmlCheckBox;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BCheckBox extends BootstrapFormElement {

    HtmlCheckBox checkBox;

    public BCheckBox(String name, String value, String label) {
        super(name, label, new HtmlCheckBox());
        addAttribute("value", value);
        this.checkBox = (HtmlCheckBox) getWrappedHtmlFormElement();
        this.checkBox.setId(name);

        getDiv().addClass("form-check");
        getLabel().addClass("form-check-label");

    }

    public void checked() {
        addAttribute("checked", "checked");
    }
}
