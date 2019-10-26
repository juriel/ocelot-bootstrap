package net.comtor.ocelot.bootstrap.forms.inputs;

import net.comtor.ocelot.bootstrap.forms.BInput;
import net.comtor.ocelot.html.forms.inputs.HtmlInput;

/**
 *
 * @author Guido A. Cafiel Vellojin
 */
public class BInputDatetime extends BInput {

    public BInputDatetime(String label, String nameAndId, String help, String error) {
        super(HtmlInput.DATETIMELOCAL, label, nameAndId, help, error);
    }
    
    public BInputDatetime(String label, String nameAndId, String help) {
        this(label, nameAndId, help, null);
    }

    public BInputDatetime(String label, String nameAndId) {
        this(label, nameAndId, null);
    }
}
