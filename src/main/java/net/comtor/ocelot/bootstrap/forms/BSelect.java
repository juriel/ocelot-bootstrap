package net.comtor.ocelot.bootstrap.forms;

import net.comtor.ocelot.bootstrap.decorators.BootstrapFormElement;
import net.comtor.ocelot.html.forms.HtmlSelect;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BSelect extends BootstrapFormElement<HtmlSelect>{

    public BSelect(String strLabel, String nameAndId, String help, String error) {
        super(error, new HtmlSelect(nameAndId), help, error);
        getInput().setId(nameAndId);
    }
    
    public BSelect(String label, String nameAndId, String help) {
        this(label, nameAndId, help, null);
    }

    public BSelect(String label, String nameAndId) {
        this(label, nameAndId, null);
    }
}
