package net.comtor.ocelot.bootstrap.forms.checkbox;

import net.comtor.ocelot.html.HtmlTag;
import net.comtor.ocelot.html.forms.HtmlFormElement;
import net.comtor.ocelot.html.forms.HtmlLabel;
import net.comtor.ocelot.html.forms.HtmlOption;
import net.comtor.ocelot.html.forms.HtmlSelect;
import net.comtor.ocelot.html.forms.inputs.HtmlCheckBox;
import net.comtor.ocelot.html.styles.HtmlDiv;

/**
 *
 * @author Guido Cafiel
 */
public class BCheckBox extends HtmlDiv implements HtmlFormElement {

    HtmlLabel htmlLabel;
    private HtmlCheckBox htmlCheckbox;

    public BCheckBox(String name, String label, String value, boolean checked) {
        this(name, label, value, "checkbox", checked);
    }

    public BCheckBox(String id, String label, String value, String style, boolean checked) {

        htmlLabel = new HtmlLabel();
        htmlLabel.setStyle("font-weight: inherit;");

        this.htmlCheckbox = new HtmlCheckBox();
        htmlLabel.add(htmlCheckbox);

        htmlCheckbox.setId(id);
        htmlCheckbox.setName(id);
        htmlCheckbox.setValue(value);
        if (checked) {
            htmlCheckbox.checked();
        }

        htmlLabel.addData(label);

        add(htmlLabel);
    }

    public HtmlFormElement required() {
        htmlCheckbox.required();
        return this;
    }

    public HtmlTag checked() {
        htmlCheckbox.addAttribute("checked", "checked");
        return this;
    }

    public HtmlTag unChecked() {
        htmlCheckbox.removeAttribute("checked");
        return this;
    }

    @Override
    public HtmlFormElement setValue(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HtmlFormElement removeRequired() {
        htmlCheckbox.removeRequired();
        return this;
    }

    @Override
    public HtmlFormElement disable() {
        htmlCheckbox.disable();
        return this;
    }

    @Override
    public HtmlFormElement enable() {
        htmlCheckbox.enable();
        return this;
    }

    @Override
    public HtmlFormElement readOnly() {
        htmlCheckbox.readOnly();
        return this;
    }

    @Override
    public HtmlFormElement removeReadOnly() {
        htmlCheckbox.removeReadOnly();
        return this;
    }

    @Override
    public HtmlSelect addOption(String value, String label) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HtmlSelect addOption(String value, String label, boolean selected) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HtmlSelect addOption(HtmlOption optionTag) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
