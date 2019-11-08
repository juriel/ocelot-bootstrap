package net.comtor.ocelot.bootstrap.forms;

import java.util.LinkedHashMap;
import net.comtor.ocelot.bootstrap.decorators.BootstrapFormElement;
import net.comtor.html.advanced.HtmlAdministrableForm;
import net.comtor.ocelot.html.forms.HtmlForm;
import net.comtor.ocelot.html.forms.HtmlFormElement;
import net.comtor.ocelot.html.forms.inputs.HtmlInputHidden;

/**
 *
 * @author juriel
 */
public class BForm extends HtmlForm implements HtmlAdministrableForm {

    LinkedHashMap<String, HtmlFormElement> fields;

    private void addFieldToMap(String id, HtmlFormElement input) {
        fields.put(id, input);
    }

    private HtmlFormElement getFieldFromMap(String name) {
        return fields.get(name);
    }

    @Override
    public void addInputHidden(String name, String value) {
        HtmlInputHidden input = new HtmlInputHidden(name, value);
        add(input);
        addFieldToMap(name, input);
    }

    @Override
    public void addField(String id, String label, HtmlFormElement input, String help, String error) {

        BootstrapFormElement<HtmlFormElement> bt = new BootstrapFormElement<>(label, input);
        add(bt);
        addFieldToMap(id, input);

        //TODO:   Juan Diego le debe agregar el error y la ayuda. Validar como manejar los campos si vienen en null
    }

    @Override
    public void addField(String label, HtmlFormElement input, String help, String error) {
        String id = input.getName();
        this.addField(id, label, input, help, error);
    }

    @Override
    public void addField(String label, HtmlFormElement input, String help) {
        this.addField(label, input, help, null);
    }

    @Override
    public void addField(String label, HtmlFormElement input) {
        this.addField(label, input, null);
    }

    @Override
    public HtmlFormElement getInput(String name) {
        return getFieldFromMap(name);
    }


}
