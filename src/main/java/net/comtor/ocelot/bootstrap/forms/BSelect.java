package net.comtor.ocelot.bootstrap.forms;

import net.comtor.ocelot.bootstrap.decorators.BootstrapFormElement;
import net.comtor.ocelot.html.forms.HtmlSelect;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BSelect extends BootstrapFormElement {

    public BSelect(String name, String label) {
        this(name, label, true);
    }

    public BSelect(String name, String label, boolean hasEmptyOption) {
        super(name, label, new HtmlSelect());

        if (hasEmptyOption) {
            getFormElement().addOption("", " -- Seleccionar --");
        }
    }

}
