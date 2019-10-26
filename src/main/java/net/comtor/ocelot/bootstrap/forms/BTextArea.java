package net.comtor.ocelot.bootstrap.forms;

import net.comtor.ocelot.bootstrap.decorators.BootstrapFormElement;
import net.comtor.ocelot.html.forms.HtmlTextarea;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BTextArea extends BootstrapFormElement<HtmlTextarea> {

    public BTextArea( String label,String nameAndId,String help,String error) {
        super(label, new HtmlTextarea(nameAndId),help, error);
        getInput().setId(nameAndId);
    }
    
    public BTextArea(String label, String nameAndId, String help) {
        this(label, nameAndId, help, null);
    }

    public BTextArea(String label, String nameAndId) {
        this(label, nameAndId, null);
    }
}
