package net.comtor.ocelot.bootstrap.forms;

import net.comtor.ocelot.bootstrap.decorators.BootstrapFormElement;
import net.comtor.ocelot.html.forms.HtmlTextarea;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BTextArea extends BootstrapFormElement {

    public BTextArea(String name, String label) {
        super(name, label, new HtmlTextarea());
    }
}
