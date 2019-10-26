package net.comtor.ocelot.bootstrap.forms.inputs;

import net.comtor.ocelot.bootstrap.forms.BInput;
import net.comtor.ocelot.html.forms.inputs.HtmlInput;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BInputFile extends BInput {

  
    public BInputFile(String label, String nameAndId, String help, String error) {
        super(HtmlInput.FILE, label, nameAndId, help, error);
    }
    
    public BInputFile(String label, String nameAndId, String help) {
        this(label, nameAndId, help, null);
    }

    public BInputFile(String label, String nameAndId) {
        this(label, nameAndId, null);
    }
}
