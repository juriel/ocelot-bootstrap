package net.comtor.ocelot.bootstrap.forms;

import net.comtor.html.advanced.AbstractHtmlAdministrableFormElement;
import net.comtor.html.advanced.HtmlAdministrableForm;
import net.comtor.ocelot.bootstrap.decorators.BootstrapFormElement;
import net.comtor.ocelot.html.forms.HtmlFormElement;

/**
 *
 * @author juriel
 */
public class BForm extends AbstractHtmlAdministrableFormElement {

    @Override
    public HtmlAdministrableForm addField(String id, String label, HtmlFormElement input, String help, String error) {
        BootstrapFormElement<HtmlFormElement> bt = new BootstrapFormElement<>(label, input);
        add(bt);
        put(id, input);
        return this;

        //TODO:   Juan Diego le debe agregar el error y la ayuda. Validar como manejar los campos si vienen en null
    }
    
    

}
