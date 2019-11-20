package net.comtor.ocelot.bootstrap.forms;

import net.comtor.ocelot.bootstrap.decorators.BootstrapFormElement;
import net.comtor.ocelot.html.forms.inputs.HtmlInputHidden;
import net.comtor.ocelot.html.forms.inputs.HtmlInputText;
import org.apache.commons.lang3.StringUtils;

// TODO: REVISAR CÓMO SE VEN EN FORM
public class BShowField extends BootstrapFormElement<HtmlInputText> {

    private HtmlInputText showInput;
    private HtmlInputHidden hiddenInput;

    public BShowField(String label, String showValue, String name, String hiddenValue) {
        super(label, new HtmlInputText(name + "_visible"));

        showInput = getInput();
        showInput.setId(name + "_visible");
        showInput.setValue(showValue);
        showInput.addAttribute("read-only", "read-only");
        showInput.setStyle("background-color: #D8D8D8");

        if (name != null) {
            hiddenInput = new HtmlInputHidden(name, hiddenValue);
            hiddenInput.setId(name);
        }
    }

    public BShowField(String label, String showValue, String name) {
        this(label, showValue, name, "");
    }

    public BShowField(String label, String showValue) {
        this(label, showValue, null);
    }

    public BShowField setValues(String showValue, String hiddenValue) {
        showInput.setValue(showValue);

        if (hiddenInput == null) {
            String name = StringUtils.replace(getInput().getName(), "_visible", "");
            hiddenInput = new HtmlInputHidden(name, hiddenValue);
        }

        hiddenInput.setValue(hiddenValue);

        return this;
    }

    @Override
    protected void preHtmlRender() {
        if (hiddenInput != null) {
            add(hiddenInput);
        }

        super.preHtmlRender();
    }

}
