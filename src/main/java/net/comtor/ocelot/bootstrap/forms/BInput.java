package net.comtor.ocelot.bootstrap.forms;

import net.comtor.ocelot.bootstrap.decorators.BootstrapFormElement;
import net.comtor.ocelot.html.forms.inputs.HtmlInput;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BInput extends BootstrapFormElement {


    public BInput(String type, String name, String label) {
        super(name,label,new HtmlInput(type));
        
    }
}
