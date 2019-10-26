package net.comtor.ocelot.bootstrap.forms;

import net.comtor.ocelot.bootstrap.decorators.BootstrapFormElement;
import net.comtor.ocelot.html.forms.HtmlFormElement;
import net.comtor.ocelot.html.forms.inputs.HtmlInput;

/**
 *
 * @author Guido A. Cafiel Vellojin
 * @author juriel
 */
public class BInput extends BootstrapFormElement<HtmlInput> {
    

    public BInput( String type,String labelStr,String nameAndId, String help, String error) {
        super(labelStr, new HtmlInput(type,nameAndId), help, error);
        HtmlFormElement input = this.getInput();
        input.setId(nameAndId);
    }
    
    private BInput( String type,String labelStr,String nameAndId, String help) {
        this(type, labelStr, nameAndId, help, null);
    }
    
    
    private BInput( String type,String labelStr,String nameAndId) {
        this(type, labelStr, nameAndId,null);
    }
}
